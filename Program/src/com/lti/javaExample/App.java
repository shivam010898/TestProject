package com.lti.javaExample;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			//Student shambhavi=new Student(101,"Shambhavi","12-02-1998");
		Info info=new Info();
			//shambhavi.setSt_id(104);
			//info.display(shambhavi);
			
			//Student st[]= new Student[5];
			Course cs[]=new Course[4];
			System.out.println("Enter the Course");
			for(int i=0;i<cs.length;i++)
			{
				//st[i]=new Student(sc.nextInt(),sc.next(),sc.next());
				cs[i]=new Course(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
			}
			System.out.println("Display the course");
			for(int i=0;i<cs.length;i++)
			{
				
				info.Coursedisplay(cs[i]);
			}
	}

}
