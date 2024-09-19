//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(read.readLine());
            ArrayList<String> arr = new ArrayList<String>();
            String input[] = read.readLine().split(" ");
            
            for(int i = 0; i < n; i++){
                arr.add(input[i]);
            }
            String word1 = read.readLine();
            String word2 = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.shortestDistance(arr,word1,word2));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        
        int cnt1 = -1; int cnt2 = -1;
        int dist = Integer.MAX_VALUE;
        for(int i = 0; i<s.size(); i++){
            if(s.get(i).equals(word1)) cnt1 = i;
            if(s.get(i).equals(word2)) cnt2 = i;
            if(cnt1 !=-1 && cnt2 != -1){
                int c = Math.abs(cnt1 - cnt2);
                dist = Math.min(dist, c);
            }
        }
        return dist;
    }
};