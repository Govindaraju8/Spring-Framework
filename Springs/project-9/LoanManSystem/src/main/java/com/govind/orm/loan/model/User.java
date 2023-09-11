package com.govind.orm.loan.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MGR_Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id ")
	private Long userid;

	
	@Column(name = "user_name ")
	private String username;
	
	@Column(name = "user_cdate ")
	private Date usercdate;
	
	@Column(name = "user_type ")
	private String usertype;
	
	@Column(name = "user_pwd ")
	private String userpwd;
	
	@Column(name = "user_email ")
	private String useremail;
	
	@Column(name = "user_recoveryemail ")
	private String userrecoveryemail;
	
	@Column(name = "user_mobile ")
	private Long usermobile;
	

	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getUserid() {
		return userid;
	}


	public void setUserid(Long userid) {
		this.userid = userid;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public Date getUsercdate() {
		return usercdate;
	}


	public void setUsercdate(String usercdate) {
		this.usercdate = Date.valueOf(usercdate);
	}


	public String getUsertype() {
		return usertype;
	}


	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}


	public String getUserpwd() {
		return userpwd;
	}


	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}


	public String getUseremail() {
		return useremail;
	}


	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public String getUserrecoveryemail() {
		return userrecoveryemail;
	}


	public void setUserrecoveryemail(String userrecoveryemail) {
		this.userrecoveryemail = userrecoveryemail;
	}


	public Long getUsermobile() {
		return usermobile;
	}


	public void setUsermobile(Long usermobile) {
		this.usermobile = usermobile;
	}


	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", usercdate=" + usercdate + ", usertype="
				+ usertype + ", userpwd=" + userpwd + ", useremail=" + useremail + ", userrecoveryemail="
				+ userrecoveryemail + ", usermobile=" + usermobile + "]";
	}

}
