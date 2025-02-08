//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long N;
            N = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.countBits(N);
            
            System.out.println(res);
            
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


class Solution {
    public static long countBits(long N) {
        // code here
      long totalbit = 0;
      
      for(int i = 0; i<=31; i++){
          long completecycle = N/(1L<<(i+1));
          
          long bitincycle = completecycle * (1L<<i);
          
          long remainingbit = N%(1L<<(i+1));
          
          long bitinremaining = Math.max(0, remainingbit-(1L<<i)+1);
          
          
          totalbit += bitincycle+bitinremaining;
      }
      return totalbit;
      
    }
}
        
