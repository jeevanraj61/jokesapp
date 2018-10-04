package com.insurance.Insuree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.Insuree.dto.CoverageDto;
import com.insurance.Insuree.dto.ModuleDto;
import com.insurance.Insuree.dto.TariffDto;
import com.insurance.Insuree.service.InsuranceService;
import com.insurance.Insuree.utils.Constants;

@RequestMapping("/insure")
@RestController
public class InsuranceController {

	@Autowired
	private InsuranceService insuranceService;

	@RequestMapping(Constants.GET_ALL_MODULES)
	public List<ModuleDto> getAllModules() {
		return insuranceService.getAllModule();
	}

	@RequestMapping(Constants.GET_ALL_COVERAGE)
	public List<CoverageDto> getAllCoverage() {
		return insuranceService.getAllCoverage();
	}

	@RequestMapping(value = Constants.CALCULATE_TARIFF, method = RequestMethod.POST)
	public TariffDto calculateTariff(@RequestBody TariffDto tariffDto) {
		return insuranceService.estimateTariffCalculations(tariffDto);
	}

	@RequestMapping(value = Constants.SAVE_TARIFF, method = RequestMethod.POST)
	public void saveTariff(@RequestBody TariffDto tariffDto) {
		insuranceService.saveTariff(tariffDto);
	}

	@RequestMapping(Constants.GET_ALL_TARIFF)
	public List<TariffDto> getAllTariff() {
		return insuranceService.getAllTariff();
	}
}
