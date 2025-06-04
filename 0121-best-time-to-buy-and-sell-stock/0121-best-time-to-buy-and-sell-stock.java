class Solution {
    public int maxProfit(int[] prices) {
        int minbuy= prices[0];
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minbuy) {
                minbuy = prices[i];
            } else if (prices[i] - minbuy > profit) {
                profit = prices[i] - minbuy;
            }
        }
        return profit;
    }
}