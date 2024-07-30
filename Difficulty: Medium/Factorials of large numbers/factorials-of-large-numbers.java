//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
import java.math.BigInteger;
class Solution {
    static ArrayList<Integer> factorial(int N) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        BigInteger big = BigInteger.valueOf(N);
        BigInteger fact = BigInteger.valueOf(1);
        //StringBuilder sb = new StringBuilder();
        
        for(int i = 1; i<=N; i++){
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        
        String str = fact.toString();
        for (int i = 0; i < str.length(); i++) {
            ans.add(Character.getNumericValue(str.charAt(i))); // Correctly add to ArrayList
        }
        return ans;
        
        
    }
}

//{ Driver Code Starts.

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int N = sc.nextInt();
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.factorial(N);
            for (Integer val : ans) System.out.print(val);
            System.out.println();
        }
    }
}
// } Driver Code Ends