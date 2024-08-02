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
            
            String input[] = read.readLine().split(" ");
            String a = input[0];
            
            Solution ob = new Solution();
            if(ob.sameFreq(a)){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    boolean sameFreq(String s) {
        // code here
       HashMap<Character, Integer> charcount = new HashMap<>();
       HashMap<Integer, Integer> freqcount = new HashMap<>();
       
       for(char ch:s.toCharArray()){
           charcount.put(ch, charcount.getOrDefault(ch, 0)+1);
       }
       
       for(int count:charcount.values()){
           freqcount.put(count,freqcount.getOrDefault(count, 0)+1);
       }
       
       if(freqcount.size()==1){
           return true;
       }
       
       if(freqcount.size() == 2){
           ArrayList<Integer> list = new ArrayList<>(freqcount.keySet());
           int f1 = list.get(0);
           int f2 = list.get(1);
           
            if ((freqcount.get(f1) == 1 && (f1 == 1 || f1 - 1 == f2)) || 
                (freqcount.get(f2) == 1 && (f2 == 1 || f2 - 1 == f1))) {
                return true;
            }
       }
       return false;
    
    }
}