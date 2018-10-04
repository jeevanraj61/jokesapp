package com.insurance.Insuree.converter;

import com.insurance.Insuree.dto.TariffDto;
import com.insurance.Insuree.entity.Tariff;

public class TariffConverter {

	public static Tariff dtoToEntity(TariffDto tariffDto) {
		Tariff tariff = new Tariff(tariffDto.getTariffCalculated(), tariffDto.getModuleName(),
				tariffDto.getCoverageStored());
		return tariff;

	}

	public static TariffDto entityToDto(Tariff tariff) {
		TariffDto tariffDto = new TariffDto(tariff.getTariffCalculated(), tariff.getModuleName(),
				tariff.getCoverageStored());
		return tariffDto;

	}
}
