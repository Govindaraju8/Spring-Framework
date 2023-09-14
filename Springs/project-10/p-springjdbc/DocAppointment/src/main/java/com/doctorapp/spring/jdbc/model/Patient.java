package com.doctorapp.spring.jdbc.model;

public class Patient {

    private int patientid;
    private String patientname;
    private int patientage;
    private String patientgender;
    private int patientmobilenumber;
    
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getPatientid() {
		return patientid;
	}
	public void setPatientid(int patientid) {
		this.patientid = patientid;
	}
	public String getPatientname() {
		return patientname;
	}
	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}
	public int getPatientage() {
		return patientage;
	}
	public void setPatientage(int patientage) {
		this.patientage = patientage;
	}
	public String getPatientgender() {
		return patientgender;
	}
	public void setPatientgender(String patientgender) {
		this.patientgender = patientgender;
	}
	public int getPatientmobilenumber() {
		return patientmobilenumber;
	}
	public void setPatientmobilenumber(int patientmobilenumber) {
		this.patientmobilenumber = patientmobilenumber;
	}
	
	

}
