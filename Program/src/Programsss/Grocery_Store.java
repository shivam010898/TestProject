package Programsss;

public class Grocery_Store {
	public static int grocery_store(int A[])
	{
		int n=A.length;
		int size=0,result=0;
		for(int i=0;i<n;i++)
		{
			if(A[i]==0)
			{
				size+=1;
				
			}
			else {
				size=-1;
			
			result=Math.max(result,-size);
			}
				
		}
		return result;
		
		
	}
	public static void main(String args[]) {
		
		int A[]= {1,1,1,0,1};
		System.out.println(grocery_store(A));
	}
	

}
