package com.lti.exceptionHandling;

public class MyException extends ArithmeticException {
	
	private static final long serialVersionUID = 1L;
	public MyException ()
	{
		System.out.println("User defined Exception");
		
	}
public String toString() {
	return "MyException object: age can't be >18";
}
}
