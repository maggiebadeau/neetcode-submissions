class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int sell;
        
        for (int i = 0; i < prices.length; i++) {
            int buy = 0;
            int profit = 0;
            sell = prices[i];

            for (int j = 0; j < i; j++) {
                profit = sell - prices[j];

                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}
