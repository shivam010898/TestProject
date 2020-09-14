package com.lti.exceptionHandling;

public class MyExceptionDemo {
static int flag=0;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
try {
	int age=12;
	
	if (age <18)
			throw new MyException();
}
catch(ArrayIndexOutOfBoundsException e0) {
	flag=1;
	System.out.println("Exception : " + e0);
}
catch(NumberFormatException e1) {
	flag=1;
	System.out.println("Exception : " + e1);
}
catch(MyException e2) {
	flag=1;
	System.out.println("Exception : " + e2);
}
if(flag==0)
{
System.out.println("Everything is fine");	
}

	
}
	}


