package Array.Stock;

public class StockI {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(new StockI().returnProfit(prices));
    }

    int returnProfit(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        int maxSellingSoFar = -1;
        int maxProfit = 0;
        for (int i = prices.length - 1; i >= 0; i--) {
            maxSellingSoFar = Math.max(maxSellingSoFar, prices[i]);
            maxProfit = Math.max(maxProfit, maxSellingSoFar - prices[i]);
        }
        return maxProfit;
    }
}
