package com.lti.exceptionHandling;

public class ThrowDemo {
	
	public static void main(String args[])
	{
		int age= 15;
		try {
		if (age < 18)
		{
			throw new ArithmeticException("Age is less than 18");
			}
		if (age >= 18 && age <=59)
		{
		System.out.print("Age is appropriate");
		}
		else {
			throw new ArithmeticException("Age is over 59");
			}}
		catch(ArithmeticException e)
		{
		System.out.println(e);	
		
		}
	}

}
