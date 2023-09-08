package com.masti.orm.loan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.masti.orm.loan.dao.LoanDAO;
import com.masti.orm.loan.model.credentialss;

@Service
public class LoanService {

	@Autowired
	private LoanDAO loandao;

	@Transactional
	public boolean checkCredentials(String username, String password) {
		List<credentialss> credentialsList = loandao.getdata();

		for (credentialss credentials : credentialsList) {
			if (credentials.getUsername().equals(username) && credentials.getPassword().equals(password)) {
				return true; // Credentials are valid
			}
		}

		return false; // Credentials are not valid
	}

}