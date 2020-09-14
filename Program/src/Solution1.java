
public class Solution1 {
	public static int numSteps(String s) {
	    long counter=0;
		long d=Long.parseLong(s,2);
		        System.out.println(d);
		while(d!=1) {
		        if(d%2!=0)
		        {
		            d=(d+1)/2;
		            counter=counter+2;
		        }
		        if(d%2==0)
		        {
		            d=d/2;
		            counter=counter+1;
		        }}
		        return (int)counter;
		        

		        
		    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.println(numSteps("11110111100000111000001100010110111100101110010101111100011011"));
	}

}
