//{ Driver Code Starts
import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] inputLine = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxProduct(arr, n));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
        // code here
        
        Long max = Long.MIN_VALUE;
        long prefix = 1;
        long sufix = 1;
        
        for(int i = 0; i<n; i++){
            if(prefix == 0) prefix = 1;
            if(sufix == 0) sufix = 1;
            
            prefix = prefix*arr[i];
            sufix = sufix*arr[n-1-i];
            
            max = Math.max(max, Math.max(prefix, sufix));
        }
        return max;
    }
}