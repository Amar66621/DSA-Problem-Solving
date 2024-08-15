//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class PhoneDigit
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();//testcases
        
        
        while(t-- > 0)
        {
            int n = sc.nextInt(); // input size of array
            int arr[] = new int[n]; //input the elements of array that are keys to be pressed
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();//input the elements of array that are keys to be pressed
            ArrayList <String> res = new Solution().possibleWords(arr, n);
            for (String i : res) System.out.print (i + " ");
             System.out.println();
              
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    //Function to find list of all words possible by pressing given numbers.
    static ArrayList<String> possibleWords(int a[], int N) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "");
        hash.put(2, "abc");
        hash.put(3, "def");
        hash.put(4, "ghi");
        hash.put(5, "jkl");
        hash.put(6, "mno");
        hash.put(7, "pqrs");
        hash.put(8, "tuv");
        hash.put(9, "wxyz");
        
        ArrayList<String> ans = new ArrayList<>();
        
        wrk(a, 0, N, hash, ans, new StringBuilder());
        return ans;
    }
    
    static void wrk(int a[], int i, int n, HashMap<Integer, String> hm, ArrayList<String> ans, StringBuilder st) {
        if (st.length() == a.length) {
            ans.add(st.toString());
            return;
        }
        
        String ss = hm.get(a[i]);
        for (int j = 0; j < ss.length(); j++) {
            st.append(ss.charAt(j));
            wrk(a, i + 1, n, hm, ans, st);
            st.deleteCharAt(st.length() - 1);
        }
    }
}