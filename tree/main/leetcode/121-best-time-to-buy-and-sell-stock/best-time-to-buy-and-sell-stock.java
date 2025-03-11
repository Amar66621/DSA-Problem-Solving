class Solution {
    public int maxProfit(int[] prices) {
        int min_p = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i<prices.length; i++){
            if(prices[i]<min_p){
                min_p = prices[i];
            }
            max = Math.max(max, prices[i]-min_p);
        }
        return max;
    }
}