//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.oddEven(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends



class Solution {
    public static String oddEven(String s) {
        // code here
        
         HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Step 1: Populate frequency map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        int x = 0; // count of distinct chars with even position and even frequency
        int y = 0; // count of distinct chars with odd position and odd frequency
        
        // Step 2: Check each character in the frequency map
        for (char ch : frequencyMap.keySet()) {
            int position = ch - 'a' + 1; // Position of character in alphabet (1-based)
            int frequency = frequencyMap.get(ch);
            
            if (position % 2 == 0 && frequency % 2 == 0) {
                // Even position in alphabet and even frequency
                x += 1;
            } else if (position % 2 != 0 && frequency % 2 != 0) {
                // Odd position in alphabet and odd frequency
                y += 1;
            }
        }
        
        // Step 3: Determine if sum of x and y is even or odd
        if ((x + y) % 2 == 0) {
            return "EVEN";
        } else {
            return "ODD";
        }
    }
}
