//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends
class Solution {
    boolean fascinating(long n) {
        String ans = ""+n+""+(n*2)+""+(n*3);
        
        HashSet<Character> set = new HashSet<>();
        
        char[] d = ans.toCharArray();
        Arrays.sort(d);
        ans = new String(d);
        return ans.equals("123456789");
        
    }
}

//{ Driver Code Starts.

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("true");
            else
                System.out.println("false");
            T--;
        }
    }
}
// } Driver Code Ends