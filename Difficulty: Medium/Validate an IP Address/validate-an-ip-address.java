//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        
        if (s.startsWith(".")||s.endsWith(".")) {
            return false;
        }
        
        String arr[] = s.split("\\.");// where i split a string into an array where i found '.'it split into an element for an array.
        //base case
        if(arr.length!=4){
            return false;
        }
        
        for(String str:arr){
            if(str.length()>3||str.isEmpty()||(str.length()>1 && str.charAt(0)=='0')){
                return false;
            }
            try{
                int val = Integer.parseInt(str);
                if(val<0 || val>255){
                    return false;
                    }
                }catch(NumberFormatException e){
                    return false;
                }
        }
        return true;
    }
}