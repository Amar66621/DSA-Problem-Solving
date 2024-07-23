//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                out.print(ans.get(i)+" ");
            }
            out.println();
                        
        }
        out.close();
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        ArrayList<String> ans = new ArrayList<>();
        char[] ch = S.toCharArray();
        Arrays.sort(ch);
        Backtrack(ans, ch, new boolean[ch.length], new StringBuilder());
        return ans;
    }
    
    private void Backtrack(ArrayList<String> ans, char []ch, boolean[] used, StringBuilder current){
        if(current.length() == ch.length){
            ans.add(current.toString());
            return;
        }
        for(int i = 0; i<ch.length; i++){
            if(used[i] || (i>0 && ch[i] == ch[i-1] && !used[i-1])){
                continue;   
            }
            used[i] = true;
            current.append(ch[i]);
            Backtrack(ans, ch, used, current);
            used[i] = false;
            current.deleteCharAt(current.length() - 1);
        }
    }
}