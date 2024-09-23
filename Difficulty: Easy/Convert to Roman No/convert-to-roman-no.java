//{ Driver Code Starts
import java.util.Scanner;
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int N = sc.nextInt();
			
			Solution ob = new Solution();
			System.out.println(ob.convertToRoman(N));
			t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

class Solution
{
	String convertToRoman(int n) {
		//code here
		String []thousand = {"", "M","MM","MMM"};
		String[] hundred ={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
		String []ten={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String []one={"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        return thousand[n/1000]+hundred[(n%1000)/100]+ten[(n%100)/10]+one[n%10];
	}
}