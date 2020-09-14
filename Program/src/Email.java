
public class Email {
	public static String Solution(String S, String C){
		String[] email=S.split(";",-2);
		String a=null;
		
		String emailss[]=new String[email.length];
		String D=null;
		for(int i=0;i<email.length;i++)
		{
			a=email[i];
			String []names=a.split(" -",-2);
			emailss[i]=names[names.length-1]+"_"+names[0]+"@"+ "<"+C+">";
				
			 D=" " + D +email[i]+" "+emailss[i]+";";
			}
		return D;
	}
	public static void main(String S,String C)
	{
		Solution("John Doe;Peter Banjamin;Mary Jane Watson-Parker","Example");
			
		}
		
	}


