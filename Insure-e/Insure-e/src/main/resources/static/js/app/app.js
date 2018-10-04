'use strict'

var insureApp = angular.module('insure', [ 'ui.bootstrap',
		'insure.controllers','insure.services']);
insureApp.constant("CONSTANTS", {
	getAllModules : "/insure/getAllModules",
	getAllCoverage : "/insure/getAllCoverage",
	calculateTariff : "/insure/calculateTariff",
	saveTariff : "/insure/saveTariff",
	getAllTariff : "/insure/getAllTariff",
});