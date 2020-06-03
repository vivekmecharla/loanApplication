package com.vivek.loanapp.loan;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

	@Autowired
	private LoanService loanService;

	@RequestMapping("/loans")
	public List<Loan> getAllLoans() {
		return loanService.getAllLoans();
	}

	@RequestMapping("/loan/{loanName}")
	public Loan getLoan(@PathVariable String loanName) {
		return loanService.getLoanByLoanName(loanName);
	}

	@GetMapping("/loan")
	public LoanResult getLoan(@RequestParam BigDecimal loanAmount, @RequestParam Integer tenure) {
		return loanService.getLoanByLoanAmountAndTenure(loanAmount, tenure);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/loans")
	public void createLoan(@RequestBody Loan loan) {
		loanService.createLoan(loan);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/loans/{loanName}")
	public void updateLoan(@RequestBody Loan loan, @PathVariable String loanName) {
		loanService.updateLoan(loanName, loan);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/loans/{loanName}")
	public void deleteLoan(@PathVariable String loanName) {
		loanService.deleteLoan(loanName);
	}

}
