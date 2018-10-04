package com.insurance.Insuree.service;

import com.insurance.Insuree.dto.TariffDto;

@FunctionalInterface
public interface TariffCalculatorService {

	public double calculateTariff(TariffDto tariffDto);

}
