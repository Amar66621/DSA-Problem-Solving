//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.util.regex.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.ExtractNumber(S));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long ExtractNumber(String sentence) {
        // code here
        long max = 0l;
        long temp = 0l;
        boolean skip = false;
        
        for(char ch: sentence.toCharArray()){
            if(Character.isDigit(ch)){
                if((int)ch -48 == 9){
                    temp = 0l;
                    skip  = true;
                }else if(!skip){
                    temp = temp *10 + (ch-'0');
                }
            }else{
                skip = false;
                max = Math.max(max, temp);
                temp = 0l;
            }
        }
        max = Math.max(max, temp);
        return (max==0) ? -1 : max; 
    }
}