package com.lti.overloadingEx;

public class ComputerTable {
	public ComputerTable(){
		double width=5.00;
		double breadth=2.00;
		double length=3.00;
		System.out.println("The width,breadth,length of the table is" +width+ " "+breadth +" "+length+ " respectively");
	}
	public ComputerTable(double width,double breadth,double length) {
	System.out.println("The width,breadth,length of the table is" +width+ " "+breadth +" "+length+ " respectively");}
}
