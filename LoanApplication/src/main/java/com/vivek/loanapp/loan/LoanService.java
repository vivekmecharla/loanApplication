package com.vivek.loanapp.loan;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

	@Autowired
	private LoanRepository loanRepository;
	
	public List<Loan> getAllLoans() {
		List<Loan> loans = new ArrayList<Loan>();
		loanRepository.findAll().forEach(loans::add);
		return loans;
	}
	
	public Loan getLoanByLoanName(String loanName) {
		return loanRepository.findById(loanName).orElse(null);
	}

	public void createLoan(Loan loan) {
		loanRepository.save(loan);
	}

	public void updateLoan(String loanName, Loan loan) {
		loanRepository.save(loan);
	}

	public void deleteLoan(String loanName) {
		loanRepository.deleteById(loanName);
	}

	public Loan getLoanByTenure(Integer tenure) {
		return loanRepository.findByTenure(tenure);
	}

	public LoanResult getLoanByLoanAmountAndTenure(BigDecimal loanAmount, Integer tenure) {
		Loan loan = loanRepository.findByAmountAndTenure(loanAmount, tenure);
		LoanResult loanResult = new LoanResult();
		
		loanResult.setEmi(loan.getEmi());
		BigDecimal interest = loan.getLoanAmount().multiply(BigDecimal.valueOf(loan.getRateOfInterest()).divide(BigDecimal.valueOf(100)));
		loanResult.setTotalInterest(interest);
//		BigDecimal repaymentAmount = loan.getLoanAmount().divide(BigDecimal.valueOf(loan.getTenure()));
		BigDecimal repaymentAmount = BigDecimal.valueOf(100);
		loanResult.setRepaymentAmount(repaymentAmount);
		return loanResult;
	}
}
