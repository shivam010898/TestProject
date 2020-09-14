package Programsss;

import java.util.*;
public class Solutions {
    static int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
            
        }
        int count = 0;
        int pos = (n + 1) / 2;
        
        int candidate = L[pos];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
            
        }
        if (2*count > n)
            return candidate;
        return (-1);
    }
    public static void main(String args[])
    {
    	int A[]= {3,3,3,4,4};
    System.out.println(	solution(A));
    }
}
