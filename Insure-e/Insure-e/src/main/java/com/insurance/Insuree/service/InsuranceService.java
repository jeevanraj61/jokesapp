package com.insurance.Insuree.service;

import java.util.List;

import com.insurance.Insuree.dto.CoverageDto;
import com.insurance.Insuree.dto.ModuleDto;
import com.insurance.Insuree.dto.TariffDto;

public interface InsuranceService {

	List<ModuleDto> getAllModule();

	List<CoverageDto> getAllCoverage();

	public TariffDto calculateTariff(TariffCalculatorService tariffCalculatorService, TariffDto tariffDto);

	public TariffDto estimateTariffCalculations(TariffDto tariffDto);

	public void saveTariff(TariffDto tariffDto);

	List<TariffDto> getAllTariff();
}
