package com.lti.CollectionsEg;

import java.util.HashMap;
import java.util.Map;

public class MapExObj {
	Map<Student,Course> m= null;
	public void addMap()
	{
		
		
		
		
		m=new HashMap<>();
		m.put(new Student(10,"Shivam","01-08-1998"),new Course(1,"java","2 months",580.00));
		m.put(new Student(11,"Shivank","01-08-1998"),new Course(2,"PYTH0N","3 months",520.00));
		m.put(new Student(12,"Shubham","01-08-1998"),new Course(3,"c++","1.5 months",650.00));
		m.put(new Student(13,"Riya","01-08-1998"),new Course(4,"c","4 months",550.00));
		
	}
	
	public void getMap() {
		
		for(Map.Entry<Student, Course> f:m.entrySet())
		{
			System.out.println(f.getKey()+ "  :  " +f.getValue());
		}
		
		
	}
	public static void main(String[] args)
	{
		MapExObj mp=new MapExObj();
		mp.addMap();
		mp.getMap();
		
		
	}


}
