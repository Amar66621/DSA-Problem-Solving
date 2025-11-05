class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int x = nums[i];
            int req = target-x;

            if(map.containsKey(req)){
                return new int[]{map.get(req),i};
            }
            map.put(x, i);
        }
        return new int[]{};
    }
}