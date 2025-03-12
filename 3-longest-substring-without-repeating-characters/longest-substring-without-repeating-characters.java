class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int length = 0;

        for(int i = 0; i<s.length(); i++){
            char currchar = s.charAt(i);

            if(map.containsKey(currchar)){
                start = Math.max(start, map.get(currchar)+1);

            }
            map.put(currchar, i);
            length = Math.max(length, i-start+1);
        }
        return length;

    }
}