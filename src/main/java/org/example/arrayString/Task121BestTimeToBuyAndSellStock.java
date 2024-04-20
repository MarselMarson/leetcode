package org.example.arrayString;

public class Task121BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int bestBuy = prices[0];
        int bestProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - bestBuy;
            if (profit > bestProfit) {
                bestProfit = profit;
            }
            if (prices[i] < bestBuy) {
                bestBuy = prices[i];
            }
        }

        return bestProfit;
    }
}
