package com.vivek.loanapp.loan;

import java.math.BigDecimal;

public class LoanResult {

	private BigDecimal totalInterest;
	private BigDecimal emi;
	private BigDecimal repaymentAmount;

	public BigDecimal getTotalInterest() {
		return totalInterest;
	}

	public void setTotalInterest(BigDecimal totalInterest) {
		this.totalInterest = totalInterest;
	}

	public BigDecimal getEmi() {
		return emi;
	}

	public void setEmi(BigDecimal emi) {
		this.emi = emi;
	}

	public BigDecimal getRepaymentAmount() {
		return repaymentAmount;
	}

	public void setRepaymentAmount(BigDecimal repaymentAmount) {
		this.repaymentAmount = repaymentAmount;
	}

	@Override
	public String toString() {
		return "LoanResult [totalInterest=" + totalInterest + ", emi=" + emi + ", repaymentAmount=" + repaymentAmount
				+ "]";
	}

}
