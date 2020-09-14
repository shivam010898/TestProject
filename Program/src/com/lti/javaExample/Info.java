package com.lti.javaExample;

public class Info {
	void display(Student student) {
		System.out.println(student.getSt_id());
		System.out.println(student.getSt_name());
		System.out.println(student.getDateOfBirth());
		
	}
	
	
		
		
		
	
	public void Coursedisplay(Course cso) {
		// TODO Auto-generated method stub
		System.out.println(cso.getName());
		System.out.println(cso.getId());
		System.out.println(cso.getDuration());
		System.out.println(cso.getFee());
		
		
	}
}

