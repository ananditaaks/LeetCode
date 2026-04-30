package top150;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int profit = 0;

        for (int price : prices) {
            if (price < min) min = price;
            else profit = Math.max(profit, price - min);
        }

        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock obj = new BestTimeToBuyAndSellStock();
        int[] prices = {7,1,5,3,6,4};

        System.out.println(obj.maxProfit(prices));
    }
}