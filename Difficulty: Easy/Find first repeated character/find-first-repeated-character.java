//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while(t-- > 0){
            String s = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.firstRepChar(s));
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String firstRepChar(String s) 
    { 
        // code here
        HashSet<Character> st = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(st.contains(ch)){
                return Character.toString(ch);
            }
            st.add(ch);
        }
        return "-1";
    }
} 