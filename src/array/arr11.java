// Leetcode 121 problem
// WAP to find the maximum profit from buying and selling a stock only once

public class arr11 {
    public static int maxProfit(int[] prices) {

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] > buyPrice) {

                // Calculate today's profit.
                int profit = prices[i] - buyPrice;

                // Update the maximum profit.
                maxProfit = Math.max(maxProfit, profit);

            } else {

                // Update the buying price if a cheaper stock is found.
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit is : " + maxProfit(prices));
    }
}