package com.govind.orm.loan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=" MGR_loanApplicants")
public class LoanApplicants {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Inap_ID ")
	private int lnapid;
	
	@Column(name = "Inap_Cust_ID ")
	private int lnapcustid;
	
	@Column(name = "Inap_ApDate ")
	private Date lnapapdate;
	
	@Column(name = "Inap_Inty_ID ")
	private int lnaplntyid;
	
	@Column(name = "Inap_Amount ")
	private double lnapamount;
	
	@Column(name = "Inap_EMI_Range_From ")
	private double lnapemirangefrom;
	
	@Column(name = "Inap_EMI_Range_To ")
	private double lnapemirangeto;
	
	@Column(name = "Inap_Nom_Requested ")
	private double lnapnomrequested;
	
	
	@Column(name = "Inap_CIBIL_Score ")
	private int lnapcibilscore;
	
	@Column(name = "Inap_Status ")
	private String lnapstatus;
	
	@Column(name = "Inap_Conclusion_Remarks ")
	private String lnapconclusionremarks;
	
	@Column(name = "Inap_Processed_User ")
	private int lnapprocesseduser;
	
	@Column(name = "Inap_Processed_Date ")
	private Date lnapprocessedDate;
	
	
	public LoanApplicants() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLnapid() {
		return lnapid;
	}
	public void setLnapid(int lnapid) {
		this.lnapid = lnapid;
	}
	public int getLnapcustid() {
		return lnapcustid;
	}
	public void setLnapcustid(int lnapcustid) {
		this.lnapcustid = lnapcustid;
	}
	public Date getLnapapdate() {
		return lnapapdate;
	}
	public void setLnapapdate(Date lnapapdate) {
		this.lnapapdate = lnapapdate;
	}
	public int getLnaplntyid() {
		return lnaplntyid;
	}
	public void setLnaplntyid(int lnaplntyid) {
		this.lnaplntyid = lnaplntyid;
	}
	public double getLnapamount() {
		return lnapamount;
	}
	public void setLnapamount(double lnapamount) {
		this.lnapamount = lnapamount;
	}
	public double getLnapemirangefrom() {
		return lnapemirangefrom;
	}
	public void setLnapemirangefrom(double lnapemirangefrom) {
		this.lnapemirangefrom = lnapemirangefrom;
	}
	public double getLnapemirangeto() {
		return lnapemirangeto;
	}
	public void setLnapemirangeto(double lnapemirangeto) {
		this.lnapemirangeto = lnapemirangeto;
	}
	public double getLnapnomrequested() {
		return lnapnomrequested;
	}
	public void setLnapnomrequested(double lnapnomrequested) {
		this.lnapnomrequested = lnapnomrequested;
	}
	public int getLnapcibilscore() {
		return lnapcibilscore;
	}
	public void setLnapcibilscore(int lnapcibilscore) {
		this.lnapcibilscore = lnapcibilscore;
	}
	public String getLnapstatus() {
		return lnapstatus;
	}
	public void setLnapstatus(String lnapstatus) {
		this.lnapstatus = lnapstatus;
	}
	public String getLnapconclusionremarks() {
		return lnapconclusionremarks;
	}
	public void setLnapconclusionremarks(String lnapconclusionremarks) {
		this.lnapconclusionremarks = lnapconclusionremarks;
	}
	public int getLnapprocesseduser() {
		return lnapprocesseduser;
	}
	public void setLnapprocesseduser(int lnapprocesseduser) {
		this.lnapprocesseduser = lnapprocesseduser;
	}
	public Date getLnapprocessedDate() {
		return lnapprocessedDate;
	}
	public void setLnapprocessedDate(Date lnapprocessedDate) {
		this.lnapprocessedDate = lnapprocessedDate;
	}
	
}
