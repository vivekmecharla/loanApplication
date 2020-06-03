package com.vivek.loanapp.loan;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface LoanRepository extends CrudRepository<Loan, String>{

	public Loan findByLoanAmount(BigDecimal loanAmount);
	public Loan findByTenure(Integer tenure);
	
	@Query("SELECT l FROM Loan l WHERE l.loanAmount = ?1 and l.tenure = ?2")
	public Loan findByAmountAndTenure(BigDecimal loanAmount, Integer tenure);

}
