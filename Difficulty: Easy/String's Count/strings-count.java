//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine().trim()); 

        while(t > 0){
        	long n = Integer.parseInt(br.readLine().trim()); 
            Solution ob = new Solution();
            System.out.println(ob.countStr(n)); 
            t--;
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    static long countStr(long n)
	{
	    // code here
	    long counta = 1;
	    long countb = n; 
	    long countc = n;
	    long countab = n*(n-1);
	    long countac = countab/2;
	    long countbc = countac*(n-2);
	    
	    long total = counta+countb+countc+countab+countac+countbc;
	    
	    return total;
	    
	    
	}
} 