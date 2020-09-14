package com.lti.CollectionsEg;
import java.util.*;


public class ArrayEg  {
 List <Course> lg= null;
 public void Process()
 {
	 lg=new ArrayList<>();
	 lg.add(new Course(1,"java","1 month",5200.00));
	 lg.add(new Course(3,"python","2 months",600.00));
	 lg.add(new Course(2,"maths","1.5 months",580.00));
	 
	}
 public void iterator()
 {
	/* for(int i=0;i<lg.size();i++)
	 {
		 System.out.println(lg.get(i));
	 }*/
	 Collections.sort(lg);
	 Iterator<Course> itr=lg.iterator();
	 while(itr.hasNext())
			 {
		 Course cu=itr.next();
		 System.out.println(cu);
		 
			 }
	 
 }
	
}
