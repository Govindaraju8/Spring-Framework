package com.masti.orm.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.masti.orm.loan.model.credentialss;

@Component
public class LoanDAO {

	@PersistenceContext
	private EntityManager em;

	public List<credentialss> getdata() {
		return em.createQuery("SELECT e FROM credentialss e").getResultList();
	}

}