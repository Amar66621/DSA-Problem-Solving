//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubstrDistinctChars(S));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubstrDistinctChars(String S){
        // code here
        ArrayList<Character> list = new ArrayList<>();
        int max = 0;
        int l = 0;
        
        for(int i = 0; i<S.length(); i++){
            char ch = S.charAt(i);
            while(list.contains(ch)){
                list.remove(Character.valueOf(S.charAt(l)));
                l++;
            }
            max = Math.max(max, i-l);
            
            list.add(ch);
        }
        return max+1;
        
    }
}