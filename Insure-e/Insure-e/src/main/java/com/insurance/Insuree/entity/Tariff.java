package com.insurance.Insuree.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Tariff {

	private @Id @GeneratedValue Long tariffId;

	@Transient
	private double premiumAmount;
	@Transient
	private double noOfMonths;
	@Transient
	private double riskPercentage;

	private double tariffCalculated;

	private String moduleName;

	private String coverageStored;

	public Tariff() {
		super();
	}

	public Tariff(double tariffCalculated, String moduleName, String coverageStored) {
		this.tariffCalculated = tariffCalculated;
		this.moduleName = moduleName;
		this.coverageStored = coverageStored;
	}

	public Tariff(double premiumAmount, double noOfMonths, double riskPercentage, double tariffCalculated,
			String moduleName, String coverageStored) {
		super();
		this.premiumAmount = premiumAmount;
		this.noOfMonths = noOfMonths;
		this.riskPercentage = riskPercentage;
		this.tariffCalculated = tariffCalculated;
		this.moduleName = moduleName;
		this.coverageStored = coverageStored;
	}

	public Long getTariffId() {
		return tariffId;
	}

	public void setTariffId(Long tariffId) {
		this.tariffId = tariffId;
	}

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public double getNoOfMonths() {
		return noOfMonths;
	}

	public void setNoOfMonths(double noOfMonths) {
		this.noOfMonths = noOfMonths;
	}

	public double getRiskPercentage() {
		return riskPercentage;
	}

	public void setRiskPercentage(double riskPercentage) {
		this.riskPercentage = riskPercentage;
	}

	public double getTariffCalculated() {
		return tariffCalculated;
	}

	public void setTariffCalculated(double tariffCalculated) {
		this.tariffCalculated = tariffCalculated;
	}

	public String getCoverageStored() {
		return coverageStored;
	}

	public void setCoverageStored(String coverageStored) {
		this.coverageStored = coverageStored;
	}

}
