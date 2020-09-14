import java.util.*;
public class Stringssss {
	public static String solutions(String S,int []A)
	{
		String d=""+S.charAt(0);
		int e=A[0];
		for(int i=1;i<A.length;i++)
		{
			d=d+S.charAt(e);
		
			e=A[e];
			if(e==0)
			{
				break;
			}
		}

		return d;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n[]= {4,3,0,1,2,5};
		System.out.println(solutions("bytdag",n));

	}

}
