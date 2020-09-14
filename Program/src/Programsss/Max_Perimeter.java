package Programsss;
import java.io.*;
import java.util.Arrays;

public class Max_Perimeter {
	public static int max_perimeter(int[]N)
	{
		Arrays.sort(N);
		int sum=-1; int max=-1;
		for(int i=1;i<N.length-2;i++)
		{
			if((N[i]+N[i+1])>N[i+2])
			{
				sum=N[i]+N[i+1]+N[i+2];
				if(max<sum)
					max=sum;
				sum=0;
			}
		} return max;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] n={6, 1, 6, 5, 8, 4}; 
		System.out.print(max_perimeter(n));

	}

}
