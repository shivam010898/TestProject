import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class Solution {
    public static int solution(int[] A) {
        // write your code in Java SE 8
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<A.length;i++)
        {
            hs.add(A[i]);
        }
        int d=0;
        for(int i=1;i<=A.length;i++)
        {
            if(hs.contains(i))
            d=1;
            else {
            d=0;
            break;}
        }
        return d;
    }
    public static void main(String []args)
    {
    	int[] A= {1,5,2,4,3};
    	System.out.print(solution(A));
    }
}