package com.vivek.loanapp.loan;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Loan {

	@Id
	private String name;
	private String panNo;
	private BigDecimal loanAmount;
	private BigDecimal emi;
	private Integer tenure;
	private Double rateOfInterest;

	public Loan() {
	}

	public Loan(String name, String panNo, BigDecimal loanAmount, BigDecimal emi, Integer tenure,
			Double rateOfInterest) {
		super();
		this.name = name;
		this.panNo = panNo;
		this.loanAmount = loanAmount;
		this.emi = emi;
		this.tenure = tenure;
		this.rateOfInterest = rateOfInterest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	public BigDecimal getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public BigDecimal getEmi() {
		return emi;
	}

	public void setEmi(BigDecimal emi) {
		this.emi = emi;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	@Override
	public String toString() {
		return "Loan [name=" + name + ", panNo=" + panNo + ", loanAmount=" + loanAmount + ", emi=" + emi + ", tenure="
				+ tenure + ", rateOfInterest=" + rateOfInterest + "]";
	}
}
