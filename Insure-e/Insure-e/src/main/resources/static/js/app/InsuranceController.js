'use strict'

var module = angular.module('insure.controllers', []);
module
		.controller(
				"InsuranceController",
				[
						"$scope",
						"InsuranceService",
						function($scope, InsuranceService) {

							$scope.allModules = [];
							$scope.allCoverageDetails = [];
							$scope.allTariff = [];
							$scope.riskPercentage = "";
							$scope.tariffCalculated = "";
							$scope.amountMax = "";
							$scope.riskForCalculation = "";
							$scope.tariffCharges = "";
							$scope.rangeText = "";
							$scope.tariffDto = {
								premiumAmount : null,
								noOfMonths : null,
								riskPercentage : null,
								tariffCalculated : null,
								moduleId : null,
								coverageRange : null
							};

							InsuranceService.getAllModules().then(
									function(value) {
										$scope.allModules = value.data;
									}, function(reason) {
										console.log("error occured");
									}, function(value) {
										console.log("no callback");
									});

							InsuranceService.getAllCoverage().then(
									function(value) {
										$scope.allCoverageDetails = value.data;
										console.log($scope.allCoverageDetails);
									}, function(reason) {
										console.log("error occured");
									}, function(value) {
										console.log("no callback");
									});

							InsuranceService.getAllTariff().then(
									function(value) {
										$scope.allTariff = value.data;
										console.log($scope.allTariff);
									}, function(reason) {
										console.log("error occured");
									}, function(value) {
										console.log("no callback");
									});

							$scope.getCheckedFunc = function() {
								$scope.amountMax = this.operation.coverageMax;
								$scope.riskForCalculation = this.operation.coverageRisk;
								$scope.rangeText = this.operation.rangeText;
								$scope.riskPercentage = 'Risk allocated for this coverage is '
										+ this.operation.coverageRisk + '%';
							}

							$scope.calculate = function() {
								$scope.tariffDto.premiumAmount = $scope.amountMax;
								$scope.tariffDto.noOfMonths = $scope.period;
								$scope.tariffDto.riskPercentage = $scope.riskForCalculation;
								console.log($scope.tariffDto);

								InsuranceService
										.caculateTariff($scope.tariffDto)
										.then(
												function(value) {
													$scope.tariffCharges = value.data.tariffCalculated;
													$scope.tariffCalculated = 'Tariff amount for module to be paid for the selected coverage is:'
															+ value.data.tariffCalculated
															+ '€';

												},
												function(reason) {
													console
															.log("error occured");
												}, function(value) {
													console.log("no callback");
												});
							}

							$scope.save = function() {
								console.log($scope);
								$scope.tariffDto.premiumAmount = $scope.amountMax;
								$scope.tariffDto.noOfMonths = $scope.period;
								$scope.tariffDto.riskPercentage = $scope.riskForCalculation;
								$scope.tariffDto.moduleName = $scope.moduleSelected.moduleName;
								$scope.tariffDto.tariffCalculated = $scope.tariffCharges;
								$scope.tariffDto.coverageStored = $scope.rangeText;
								console.log($scope);

								InsuranceService
										.saveTariff($scope.tariffDto)
										.then(
												function(value) {
													InsuranceService
															.getAllTariff()
															.then(
																	function(
																			value) {
																		$scope.allTariff = value.data;
																		console
																				.log($scope.allTariff);
																	},
																	function(
																			reason) {
																		console
																				.log("error occured");
																	},
																	function(
																			value) {
																		console
																				.log("no callback");
																	});
												},
												function(reason) {
													console
															.log("error occured");
												}, function(value) {
													console.log("no callback");
												});
							}

						} ]);