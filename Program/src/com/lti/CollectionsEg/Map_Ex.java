package com.lti.CollectionsEg;
import java.util.*;

public class Map_Ex {
	Map<Integer,String> m= null;
	public void addMap()
	{
		m=new HashMap<>();
		m.put(101,"Shikhar");
		m.put(102,"Shivam");
		m.put(103,"Shivank");
		m.put(104, "Shambhavi");
		
		
	}
	
	/*public void getMap() {
		System.out.println(m.get(101));
		
		
	}*/
	public void getMap() {
		m.entrySet();
		for(Map.Entry<Integer, String> e:m.entrySet())
		{
			System.out.println(e.getKey()+ " : " +e.getValue());
		}
		
	}
	
	public static void main(String[] args)
	{
		Map_Ex mp=new Map_Ex();
		mp.addMap();
		mp.getMap();
		
		
	}

}
