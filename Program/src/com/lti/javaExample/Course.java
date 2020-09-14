package com.lti.javaExample;


public class Course {
	private int id; private Double fee;private String name; private String Duration;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}

	public Course(int id, String name, String Duration, double fee) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.Duration=Duration;
		this.fee=fee;
	}
}