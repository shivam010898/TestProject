package com.lti.javaExample;


public class Student {
	private int st_id;
	private String st_name;
	private String dateOfBirth;
	public Student(int st_id, String st_name, String dateOfBirth) {
		this.st_id = st_id;
		this.st_name = st_name;
		this.dateOfBirth = dateOfBirth;
	}
	public int getSt_id() {
		return st_id;
	}
	public void setSt_id(int st_id) {
		this.st_id = st_id;
	}
	public String getSt_name() {
		return st_name;
	}
	public void setSt_name(String st_name) {
		this.st_name = st_name;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	
	
}
