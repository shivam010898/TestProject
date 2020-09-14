package com.lti.CaseStudyEx;


import java.util.*;


public class ArrayEg {
 List <Integer> lg= null;
 public void Process()
 {
	 lg=new ArrayList<>();
	 lg.add(10);
	 lg.add(15);
	 lg.add(45);
	 lg.add(20);
	}
 public void iterator()
 {
	/* for(int i=0;i<lg.size();i++)
	 {
		 System.out.println(lg.get(i));
	 }*/
	 Collections.sort(lg);
	 Iterator<Integer> itr=lg.iterator();
	 while(itr.hasNext())
			 {
		 Integer cu=itr.next();
		 System.out.println(cu);
		 
			 }
	 
 }
	
}

