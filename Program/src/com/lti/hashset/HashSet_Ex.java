package com.lti.hashset;
import java.util.*;

public class HashSet_Ex {
	HashSet<Integer> al= null;
	public void addMethod() {
		
		System.out.println("Adding values to the set");
		al=new HashSet<>();
		al.add(20);
		al.add(30);
		al.add(10);
		al.add(40);
		al.add(50);
	}
	public void getMethod() {
		
		for(Integer num : al)
		{
			
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		
		HashSet_Ex h= new HashSet_Ex();
		h.addMethod();
		h.getMethod();
		
	}

}
