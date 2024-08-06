//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            for(int i = 0;i<n;i++)
                arr[i] = sc.next();
            
            Solution ob = new Solution();
            
            System.out.println(ob.secFrequent(arr, n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String secFrequent(String arr[], int N)
    {
        // your code here
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String s:arr){
            map.put(s, map.getOrDefault(s, 0)+1);
        }
        
        int maxoccur = Integer.MIN_VALUE;
        for(int i = 0; i<N; i++){
            if(map.get(arr[i])>maxoccur){
                maxoccur = map.get(arr[i]);
            }
        }
        
        int maxsecoccur = Integer.MIN_VALUE;
        for(int i =0; i<N; i++){
            if(map.get(arr[i])<maxoccur && map.get(arr[i])>maxsecoccur){
                maxsecoccur = map.get(arr[i]);
            }
        }
        
        
        String ans = "";
        for(int i = 0; i<N; i++){
            if(map.get(arr[i]) == maxsecoccur){
                ans += arr[i];
                break;
            }
        }
        return ans;
    }
}