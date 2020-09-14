
public class Double_Slice {

	public static int sliced(int a[]) {
		 int b = a[0];
	        int c=0;
	        for(int i=0;i<a.length;i++) {
	            if(a[i]!=b) {
	                c=a[i];
	                break;
	            }
	        }
	        
	        int d =0;
	        int max =1;
	        for(int i=0;i<a.length;i++) {
	            if(i==a.length-1) {
	                if(a[i]==b | a[i]==c ) {
	                    max++;
	                }
	                break;
	            }
	            if((a[i+1]==b | a[i+1]==c)) {
	                max++;
	            }
	            else {
	                if(a[i]==b) {
	                    c=a[i+1];
	                    if(max>d) {
	                        d=max;
	                    }
	                    max=2;
	                }
	                else {
	                    b= a[i+1];
	                    if(max>d) {
	                        d=max;
	                    }
	                    max =2;
	                }
	            }
	            
	            
	            
	        }
	        if(max>d) {
	            d=max;
	        }
	        
	        return d;
}
public static void main(String args[])
{
	int A[]= {5,4,3,2,0,0,0};
	System.out.println(sliced(A));
	}
}