//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        // code here
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        for(int i = 0; i<n; i++){
            int count = 1;
            
            while(i+1<n && s.charAt(i+1) == s.charAt(i)){
                count++;
                i++;
            }
            
        sb.append(s.charAt(i));
        sb.append(count);
        }
        
        return sb.toString();
    }
}
    