package com.masti.orm.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.masti.orm.loan.service.LoanService;

@Controller
public class LoanController {

	private LoanService loanser;

	@Autowired
	public LoanController(LoanService loanser) {
		this.loanser = loanser;
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String checkCredentials(@RequestParam("username") String username,
			@RequestParam("password") String password) {
		// Call the service method to check credentials
		boolean isValidCredentials = loanser.checkCredentials(username, password);

		if (isValidCredentials) {
			// Credentials are valid, you can redirect to a success page
			return "success";
		} else {
			// Credentials are not valid, you can redirect to a login error page
			return "login";
		}
	}

}