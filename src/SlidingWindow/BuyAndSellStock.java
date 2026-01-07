package SlidingWindow;

//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
//121. Best Time to Buy and Sell Stock
public class BuyAndSellStock {
    static void main() {
        int[]  prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int maxProfit  = 0;
        int minPrice = Integer.MAX_VALUE;

        for(int price : prices){
           if(price < minPrice){
               minPrice = price;
           }
           maxProfit = Math.max(maxProfit, price - minPrice);
        }

        return maxProfit;
    }
}
