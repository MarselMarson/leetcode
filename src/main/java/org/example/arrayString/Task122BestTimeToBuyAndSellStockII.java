package org.example.arrayString;

public class Task122BestTimeToBuyAndSellStockII {
    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            } else {
                if (buyPrice < prices[i] && (i == prices.length - 1 || prices[i + 1] < prices[i])) {
                    profit += prices[i] - buyPrice;
                    buyPrice = prices[i];
                }
            }

        }

        return profit;
    }
}
