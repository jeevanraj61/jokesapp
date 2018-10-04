package com.insurance.Insuree.converter;

import com.insurance.Insuree.dto.CoverageDto;
import com.insurance.Insuree.entity.Coverage;

public class CoverageConverter {

	public static CoverageDto entityToDto(Coverage coverage) {

		CoverageDto coverageDto = new CoverageDto(coverage.getCoverageId(), coverage.getCoverageMin(),
				coverage.getCoverageMax(), coverage.getCoverageRisk(), coverage.getRangeText());

		return coverageDto;

	}
}
