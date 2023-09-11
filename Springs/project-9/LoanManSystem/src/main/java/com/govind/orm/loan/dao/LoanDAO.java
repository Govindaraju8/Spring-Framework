package com.govind.orm.loan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import com.govind.orm.loan.model.Customers;
import com.govind.orm.loan.model.LoanApplicantNominees;
import com.govind.orm.loan.model.LoanApplicants;
import com.govind.orm.loan.model.LoanInputApplication;
import com.govind.orm.loan.model.User;

@Component
public class LoanDAO {

	@PersistenceContext
	private EntityManager em;
	
	public void addobjpersistent(LoanInputApplication la) {
		em.persist(la);
	}
	
	public void savecustomers(Customers customer) {
		em.persist(customer);
	}
	
	public void saveLAN(LoanApplicantNominees lan) {
		em.persist(lan);
	}
	
	public void saveLoan(LoanApplicants loan) {
		em.persist(loan);
	}
	
	public void UserRegister(User us) {
		em.persist(us);
	}
	
	public void addLoanApplicant(LoanApplicants la) {
		em.persist(la);
	}
	
	public void updateLoanApplicant(LoanApplicants la)
	 {
		 em.merge(la);
	 }
	

	public User getdata(Long long1) {
	    return (User) em.createQuery("SELECT e FROM User e WHERE e.userid = :num").setParameter("num", long1).getSingleResult();
	}

	public List<LoanApplicants> getLoanapplicants(){
		return em.createQuery("SELECT la FROM LoanApplicants la").getResultList();

	}
	
	public LoanApplicants getperloanapplicant(int i) {
	    return (LoanApplicants) em.createQuery("SELECT la FROM LoanApplicants la WHERE la.lnapid = :num").setParameter("num", i).getSingleResult();
	}


	public List<LoanApplicants> getuserLoans(int id) {
	    return em.createQuery("SELECT la FROM LoanApplicants la WHERE la.lnapprocesseduser = :id")
	            .setParameter("id", id)
	            .getResultList();
	}
	

}
