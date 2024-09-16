//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            List<Integer> arr = new ArrayList<>();
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            while (st.hasMoreTokens()) {
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Solution ob = new Solution();
            int ans = ob.findElement(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int findElement(List<Integer> arr) {
        // Code here
        int max[] = new int[arr.size()];
        int min[] = new int[arr.size()];
        max[0] = arr.get(0);
        for(int i = 1; i <arr.size(); i++){
            max[i] = Math.max(max[i-1], arr.get(i));
        }
        
        min[arr.size()-1] = arr.get(arr.size()-1);
        for(int i = arr.size()-2; i>=0; i--){
            min[i] = Math.min(min[i+1], arr.get(i));
        }
        
        for(int i = 1; i<arr.size()-1; i++){
            if(max[i-1]<arr.get(i) && min[i+1]>arr.get(i)){
                return arr.get(i);
            }
        }
        return -1;
    }
}