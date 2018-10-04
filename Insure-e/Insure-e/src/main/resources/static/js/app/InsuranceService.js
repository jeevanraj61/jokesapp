'use strict'

angular.module('insure.services', []).factory('InsuranceService',
		[ "$http", "CONSTANTS", function($http, CONSTANTS) {
			var service = {};
			service.getAllModules = function() {
				return $http.get(CONSTANTS.getAllModules);
			}
			service.getAllCoverage = function() {
				return $http.get(CONSTANTS.getAllCoverage);
			}
			service.caculateTariff = function(tariffDto) {
				return $http.post(CONSTANTS.calculateTariff, tariffDto);
			}
			service.saveTariff = function(tariffDto) {
				return $http.post(CONSTANTS.saveTariff, tariffDto);
			}
			service.getAllTariff = function() {
				return $http.get(CONSTANTS.getAllTariff);
			}
			return service;
		} ]);