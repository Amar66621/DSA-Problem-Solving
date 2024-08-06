//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		System.out.println (new Sol().countRev (s));
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int countRev (String s)
    {
        // your code here   
        Stack<Character> S = new Stack<>();
        int storeans = 0;
        
         for(int i = 0; i<s.length(); i++){
             if(s.charAt(i) == '{'){
                 S.push(s.charAt(i));
             }
             
             if(s.charAt(i) == '}'){
                 if(!S.isEmpty() && S.peek() == '{'){
                     S.pop();
                 }
                 else{
                     storeans = storeans+1;
                     S.push('{');
                 }
             }
         }
         
         int n = S.size();
         if(n%2 != 0){
             return -1;
         }
         else{
             storeans += n/2;
         }
         
        return storeans;
    }
}