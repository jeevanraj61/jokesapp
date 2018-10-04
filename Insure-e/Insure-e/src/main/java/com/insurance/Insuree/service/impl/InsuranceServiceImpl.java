package com.insurance.Insuree.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.Insuree.converter.CoverageConverter;
import com.insurance.Insuree.converter.ModuleConverter;
import com.insurance.Insuree.converter.TariffConverter;
import com.insurance.Insuree.dto.CoverageDto;
import com.insurance.Insuree.dto.ModuleDto;
import com.insurance.Insuree.dto.TariffDto;
import com.insurance.Insuree.repository.CoverageRepository;
import com.insurance.Insuree.repository.ModuleRepository;
import com.insurance.Insuree.repository.TariffRepository;
import com.insurance.Insuree.service.InsuranceService;
import com.insurance.Insuree.service.TariffCalculatorService;

@Service
public class InsuranceServiceImpl implements InsuranceService {

	@Autowired
	private ModuleRepository moduleRepository;

	@Autowired
	private CoverageRepository coverageRepository;

	@Autowired
	private TariffRepository tariffRepository;

	@Override
	public List<ModuleDto> getAllModule() {
		return moduleRepository.findAll().stream().map(ModuleConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public List<CoverageDto> getAllCoverage() {
		return coverageRepository.findAll().stream().map(CoverageConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public TariffDto calculateTariff(TariffCalculatorService tariffCalculatorService, TariffDto tariffDto) {
		tariffDto.setTariffCalculated(tariffCalculatorService.calculateTariff(tariffDto));
		return tariffDto;
	}

	@Override
	public void saveTariff(TariffDto tariffDto) {
		System.out.println(tariffDto);
		tariffRepository.save(TariffConverter.dtoToEntity(tariffDto));
	}

	@Override
	public List<TariffDto> getAllTariff() {
		return tariffRepository.findAll().stream().map(TariffConverter::entityToDto).collect(Collectors.toList());
	}

	@Override
	public TariffDto estimateTariffCalculations(TariffDto tariffDto) {
		return this
				.calculateTariff(
						(s) -> ((s.getPremiumAmount() / s.getNoOfMonths())
								+ ((s.getPremiumAmount() / s.getNoOfMonths()) * (s.getRiskPercentage() / 100))),
						tariffDto);
	}

}
