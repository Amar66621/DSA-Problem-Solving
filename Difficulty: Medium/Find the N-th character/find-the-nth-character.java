//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String S = sc.next();
                    int R = sc.nextInt();
                    int N = sc.nextInt();
                    Solution obj = new Solution();
                    System.out.println(obj.nthCharacter(S,R,N));
                }
                
        }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        //code here
     int prev = 0;
     int curr = n+1;
     boolean flip = false;
     for(int i = r; i>0; i--){
         if(curr == 1){
             prev = 1;
         }
         else{
             if(curr%2 == 1){
                 prev = (curr/2)+1;
             }else{
                 prev=curr/2;
                 flip = !flip;
             }
         }
        curr = prev;
     }
     char ch = s.charAt(prev-1);
     if(flip){
         if(ch == '1') return '0';
         else return '1';
     }
     return ch;
    }
}