//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int k = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.longestkSubstr(s, k));
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int longestkSubstr(String s, int k) {
        // code here
        HashMap<Character, Integer> map = new HashMap<>();
        
        int max = -1;
        int i = 0; 
        int j = 0;
        
        while(j<s.length()){
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0)+1);
            if(map.size() == k){
                max = Integer.max(max, j-i+1);
            }
            
            while(map.size()>k){
                char ch1 = s.charAt(i);
                if(map.containsKey(ch1)){
                    map.put(ch1, map.get(ch1)-1);
                    if(map.get(ch1)==0){
                        map.remove(ch1);
                    }
                }
                i++;
            }
            j++;
        }
        return max;
    }
}