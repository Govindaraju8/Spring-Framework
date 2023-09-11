package com.govind.orm.loan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mgr_loanApplicantNominees")
public class LoanApplicantNominees {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Inap_ID")
	private int lnapid;
	
	@Column(name = "Inap_Nominee")
    private String lnapnominee;
	
	@Column(name = "Inap_Relation")
    private String lnaprelation;
    
    
    
    
	public LoanApplicantNominees() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLnapid() {
		return lnapid;
	}
	public void setLnapid(int lnapid) {
		this.lnapid = lnapid;
	}
	public String getLnapnominee() {
		return lnapnominee;
	}
	public void setLnapnominee(String lnapnominee) {
		this.lnapnominee = lnapnominee;
	}
	public String getLnaprelation() {
		return lnaprelation;
	}
	public void setLnaprelation(String lnaprelation) {
		this.lnaprelation = lnaprelation;
	}
}
