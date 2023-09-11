package com.govind.orm.loan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mgr_customer")
public class Customers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Cust_ID")
	private int custid;
	
	@Column(name = "Cust_FirstName")
	private String custfirstname;
	

	@Column(name = "Cust_LastName")
    private String custlastname;
    

	@Column(name = "Cust_DOB")
    private Date custdob;
	
	@Column(name = "Cust_PANNo")
    private String custpanno;
	
	@Column(name = "Cust_Mobile")
    private String custmobile;
	

	@Column(name = "Cust_Address")
    private String custaddress;
	
	@Column(name = "Cust_GuardianName")
    private String custgname;
    
	@Column(name = "Cust_LastUpdatedDate")
    private Date custluudate;
    
    @Column(name = "Cust_LUser")
    private int custluser;
    
    
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustfirstname() {
		return custfirstname;
	}
	public void setCustfirstname(String custfirstname) {
		this.custfirstname = custfirstname;
	}
	public String getCustlastname() {
		return custlastname;
	}
	public void setCustlastname(String custlastname) {
		this.custlastname = custlastname;
	}
	public Date getCustdob() {
		return custdob;
	}
	public void setCustdob(Date custdob) {
		this.custdob = custdob;
	}
	public String getCustpanno() {
		return custpanno;
	}
	public void setCustpanno(String custpanno) {
		this.custpanno = custpanno;
	}
	public String getCustmobile() {
		return custmobile;
	}
	public void setCustmobile(int a) {
		this.custmobile = Integer.toString(a);
	}
	public String getCustaddress() {
		return custaddress;
	}
	public void setCustaddress(String custaddress) {
		this.custaddress = custaddress;
	}
	public String getCustgname() {
		return custgname;
	}
	public void setCustgname(String custgname) {
		this.custgname = custgname;
	}
	public Date getCustluudate() {
		return custluudate;
	}
	public void setCustluudate(Date custluudate) {
		this.custluudate = custluudate;
	}
	public int getCustluser() {
		return custluser;
	}
	public void setCustluser(int custluser) {
		this.custluser = custluser;
	}
	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custfirstname=" + custfirstname + ", custlastname=" + custlastname
				+ ", custdob=" + custdob + ", custpanno=" + custpanno + ", custmobile=" + custmobile + ", custaddress="
				+ custaddress + ", custgname=" + custgname + ", custluudate=" + custluudate + ", custluser=" + custluser
				+ "]";
	}
    
    
}
