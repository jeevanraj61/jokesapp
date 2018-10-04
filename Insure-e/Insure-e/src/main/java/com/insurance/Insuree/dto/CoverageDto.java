package com.insurance.Insuree.dto;

public class CoverageDto {

	private Long coverageId;
	private Long coverageMin;
	private Long coverageMax;
	private int coverageRisk;
	private String rangeText;

	public CoverageDto(Long coverageId, Long coverageMin, Long coverageMax, int coverageRisk, String rangeText) {
		this.coverageId = coverageId;
		this.coverageMin = coverageMin;
		this.coverageMax = coverageMax;
		this.coverageRisk = coverageRisk;
		this.rangeText = rangeText;
	}

	public Long getCoverageId() {
		return coverageId;
	}

	public void setCoverageId(Long coverageId) {
		this.coverageId = coverageId;
	}

	public Long getCoverageMin() {
		return coverageMin;
	}

	public void setCoverageMin(Long coverageMin) {
		this.coverageMin = coverageMin;
	}

	public Long getCoverageMax() {
		return coverageMax;
	}

	public void setCoverageMax(Long coverageMax) {
		this.coverageMax = coverageMax;
	}

	public int getCoverageRisk() {
		return coverageRisk;
	}

	public void setCoverageRisk(int coverageRisk) {
		this.coverageRisk = coverageRisk;
	}

	public String getRangeText() {
		return rangeText;
	}

	public void setRangeText(String rangeText) {
		this.rangeText = rangeText;
	}

}
