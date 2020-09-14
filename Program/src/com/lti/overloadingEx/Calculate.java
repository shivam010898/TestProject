package com.lti.overloadingEx;

public class Calculate {
	public Calculate(){}
	
	public Calculate(int a,int b)
	{
		
		System.out.println("Integer value adding "+(a+b));
		
	}
	public Calculate(double a,double b)
	{
		
		System.out.println("Double value adding "+(a+b));
		
	}
	public void substract(int a,int b)
	{
		
		System.out.println("Integer value substract "+(a-b));
		
	}
	public void substract(double a,double b)
	{
		
		System.out.println("Double value substract "+(a-b));
		
	}

}
