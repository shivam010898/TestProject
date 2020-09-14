package Programsss;

public class Text_Example {

	public static int count(String S,int k)
	{
		int d= S.length();
		
		int count=d/k;
		if(d%k==0) 
		
			return count;
		
		else
	
			return ++count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("SMS messages are really short",12));

	}

}
