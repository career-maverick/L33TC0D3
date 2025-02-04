public class Problem123 {

    private static int maxProfit(int[] prices) {
        if (prices==null || prices.length<2) {
            return 0;
        }

        int firstBuy = Integer.MAX_VALUE;
        int secondBuy = Integer.MAX_VALUE;
        int firstProfit = 0, secondProfit =0;

        for(int price : prices){
            firstBuy = Math.min(firstBuy, price);
            firstProfit = Math.max(firstProfit, price-firstBuy);
            secondBuy = Math.min(secondBuy, price-firstProfit);
            secondProfit = Math.max(secondProfit, price - secondBuy);
        }
        
        return secondProfit;
    }
    public static void main(String[] args) {
        int[] prices = {5,4,3,2,1,6};
        System.out.println(maxProfit(prices)); 
    }
}
