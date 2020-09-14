package Programsss;

import java.util.Arrays;

public class Minimmum_kit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {5,3,4,2,1};
		System.out.print(kit(a));
		

	}
	
	public static int kit(int a[])
	{int i;
		int sum=0;
		for( i=0;i<a.length;i++) {
			
			sum=sum+a[i];
		}
		Arrays.sort(a);
		int counter=1;
		int right_sum=0;int left_sum=0;
		for(i=a.length-1;i>=0;i--) {
		right_sum=right_sum+a[i];
		left_sum=sum-right_sum;
		if(right_sum>left_sum)
		{
			return counter;
		}
		else 
		{
			counter++;
		}
		}
		return counter;
		
		
		
		
	}
	
	
	

}
