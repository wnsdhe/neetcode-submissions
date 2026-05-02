class Solution {
    public int maxProfit(int[] prices) {
        int prevPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
            if (price < prevPrice) {
                prevPrice = price;
            }
            if (price > prevPrice) {
                if ((price - prevPrice) > maxProfit) {
                    maxProfit = price - prevPrice;
                }
            }
        }
        return maxProfit;
    }
}
