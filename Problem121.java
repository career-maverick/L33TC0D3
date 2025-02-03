public class Problem121 {

    private static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; //initialize minPrice to maximum value
        int maxProfit = 0; //initialize maxProfit to 0
        for (int price : prices) { //iterate through the prices array
            if (price < minPrice) { //if price is less than minPrice, update minPrice
                minPrice = price;
            } else if (price - minPrice > maxProfit) { //if price - minPrice is greater than maxProfit, update maxProfit
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices)); 
    }
}
