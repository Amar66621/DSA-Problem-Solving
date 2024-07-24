//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	if(s.length()==0||s == null){
	    return -1;
	}
	
	int start = 0;
	boolean isNegative = false;
	if(s.charAt(0) == '-'){
	    isNegative = true;
	    start = 1;
	    if(s.length()==1){
	        return -1;
	    }
	}
	
	int result = 0;
	for(int i = start; i<s.length(); i++){
	    char ch = s.charAt(i);
	    if(ch<'0'||ch>'9'){
	        return -1;
	    }
	    int digit = ch-'0';
	    result = result*10+digit;
	}
	
	if(isNegative){
	    result = -result;
	}
	return result;
    }
}
