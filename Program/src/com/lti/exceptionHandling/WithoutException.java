package com.lti.exceptionHandling;
import java.util.*;

public class WithoutException {
	
	static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= sc.nextInt();
		int b=sc.nextInt();
		try {
			
			int c=a/b;
			System.out.println("value of c is" +c);
		}
			catch(Throwable t)
		{
				System.out.println(t.getMessage());
		}
		
		
	}

}
