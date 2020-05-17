package Week_04;

//https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/description/
public class BestTimeToBuyAndSellStockii {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int k = 0 ; k < prices.length -1 ; k++) {
            if (prices[k+1] > prices[k]) {
                total += prices[k+1] - prices[k];
            }
        }
        return total;
    }
}
