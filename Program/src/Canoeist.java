
public class Canoeist 
{

	public int greedyCanoeist(int W[], int k)
	{
		int canoes=0;
		int j=0;
		int i=W.length-1;
		while(i>=j)
		{
			if (W[i]+W[j]<=k)
			{
				j=j+1;
						}
			canoes=canoes+1;
			i=i-1;

		}
		return canoes ;
		
		
	}
	public static void main(String args[])
	{
		int W[]= {2,3,4,5,6,7,8};
		int k=8;
		Canoeist obj=new Canoeist();
		System.out.println(obj.greedyCanoeist(W, k));
		
		
	}
}
