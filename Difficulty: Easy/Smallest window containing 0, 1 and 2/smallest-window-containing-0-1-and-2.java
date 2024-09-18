//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
      int ans = Integer.MAX_VALUE; // Set ans to a large number initially
        int zero = 0, one = 0, two = 0;
        int l = 0;

        // Traverse the string with the right pointer 'r'
        for (int r = 0; r < S.length(); r++) {
            char currentChar = S.charAt(r);

            // Increment count based on the character at position 'r'
            if (currentChar == '0') {
                zero++;
            } else if (currentChar == '1') {
                one++;
            } else if (currentChar == '2') {
                two++;
            }

            // Once we have at least one '0', one '1', and one '2', try shrinking the window
            while (zero > 0 && one > 0 && two > 0) {
                // Update the smallest substring length
                ans = Math.min(ans, r - l + 1);

                // Move the left pointer 'l' to shrink the window
                char leftChar = S.charAt(l);
                if (leftChar == '0') {
                    zero--;
                } else if (leftChar == '1') {
                    one--;
                } else if (leftChar == '2') {
                    two--;
                }
                l++; // Shrink the window from the left
            }
        }

        // If ans was never updated, return -1, otherwise return ans
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
};
