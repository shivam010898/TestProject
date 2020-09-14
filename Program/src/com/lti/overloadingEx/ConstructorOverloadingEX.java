package com.lti.overloadingEx;

public class ConstructorOverloadingEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculate calc=new Calculate();
		Calculate cal=new Calculate(10,100);
		Calculate call=new Calculate(10.00,100); //double
		calc.substract(310, 765);
		calc.substract(120.09, 130.25);
	}

}
