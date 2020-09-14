package Programsss;


public class Email {
	public static String Solution(String S, String C){
		String[] email=S.split(";",-2);
		String a;
		
		String emailss[]=new String[email.length];
		String D=" ";
		for(int i=0;i<email.length;i++)
		{
			a=email[i];
			String []names=a.split("[ -]+",-2);
			emailss[i]= "<"+names[names.length-1]+"_"+names[0]+"@"+C+">";
				
			 D= D+email[i]+" "+emailss[i]+";" ;
			}
		
		return D;
	}
	public static void main(String args[])
	{
		System.out.print(Solution("John Doe;Peter Banjamin;Mary Jane Watson-Parker","Example"));
			
		}
		
	}



