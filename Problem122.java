public class Problem122 {

    private static int maxProfit(int[] prices) {
        int maxProfit = 0; //initialize maxProfit to 0
        // Iterate through the prices array
        for (int i = 1; i < prices.length; i++) {
            // If today's price is higher than yesterday's, take the profit
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); 
    }
}
