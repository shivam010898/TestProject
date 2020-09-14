package Programsss;

import java.util.HashSet;
import java.util.Set;

public class EmailGenerate {
	public static String solution(String S, String C) {
		String [] names = S.split("; ");
		StringBuilder result = new StringBuilder();
		Set<String> emailSet = new HashSet<>();
		for (String string : names) {
			result.append(string);
			String email;
			String [] s = string.split(" ");
			String firstName = s[0].toLowerCase();
			String lastName = s[s.length-1].toLowerCase();
			if(lastName.indexOf('-') != -1) {
				int i = lastName.indexOf('-');
				lastName = lastName.substring(0,i)+ lastName.substring(i+1);
			}
			
			email = lastName+"_"+firstName+"@"+C+".com";
			
			if(emailSet.isEmpty()) {
				emailSet.add(email);
			}
			else if(emailSet.contains(email)) {
				int i = 2;
				while(emailSet.contains(email)) {
					
					email = lastName+ "_"+ firstName+ i +"@"+C+".com";
					i++;
				}
				emailSet.add(email);
			}
			else {
				emailSet.add(email);
			}
	
			result.append(" <"+email+">; ");
		}
		
		String res = new String(result);
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "Shubhrang Dixit; Prajval Chauhan; Prem Pranjal Jha; Kareena Kapoor-Khan; Arun Kumar Mishra; Arun Pratap Mishra; Arun Mishra; Shubhrang Dixit; Shubhrang Dixit; Prem Pranjal Jha ";
		String C = "lti";
		System.out.println(solution(S, C));

	}

}