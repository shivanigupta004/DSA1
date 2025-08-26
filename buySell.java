/**
 * This class provides a method to calculate the maximum profit
 * from a single buy and sell operation on a given array of stock prices.
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class buySell {

    /**
     * Calculates the maximum profit from buying and selling stocks.
     * @param prices Array of stock prices where prices[i] is the price on day i.
     * @return Maximum profit achievable.
     */
    public static int buyAndSellStocks(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (buyPrice < price) {
                int profit = price - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = price;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4, 12};
        System.out.println("Maximum profit is: " + buyAndSellStocks(prices));
    }
}