//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String input = br.readLine();
            String[] inputArray = input.split("\\s+");
            ArrayList<Integer> arr = new ArrayList<>();

            for (String s : inputArray) {
                arr.add(Integer.parseInt(s));
            }

            new Solution().rearrange(arr);
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    void rearrange(ArrayList<Integer> arr) {
        // code here
        ArrayList<Integer> post = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        
       for(int num:arr){
           if(num>=0){
               post.add(num);
           }else{
               neg.add(num);
           }
       }
       
       ArrayList<Integer> result = new ArrayList<>();
       int postindex = 0; int negindex = 0;
       
       while(postindex<post.size() && negindex<neg.size()){
           result.add(post.get(postindex++));
           result.add(neg.get(negindex++));
       }
       
       while(postindex<post.size()){
           result.add(post.get(postindex++));
       }
       while(negindex<neg.size()){
           result.add(neg.get(negindex++));
       }
       
       arr.clear();
       arr.addAll(result);
    }
}