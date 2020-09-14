package Programsss;
import java.io.*;
public class CharacterReplace {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in)); 
		 String S = reader.readLine();
		 
System.out.print(replace(S));
	}
	public static String replace(String S)
	{

String d="";
d=d+S.charAt(0);


		
		for(int i=1;i<S.length()-1;i++)
			
		{
			if((S.charAt(i-1)=='s' || S.charAt(i-1)=='S') && (S.charAt(i+1)=='r' || S.charAt(i+1)=='R'))
			{
		continue;
				
		
			}
			else {
				d=d+S.charAt(i);
			}
			
		
			
		}
		d=d+S.charAt(S.length()-1);
		return d;
		
		
	}
}
