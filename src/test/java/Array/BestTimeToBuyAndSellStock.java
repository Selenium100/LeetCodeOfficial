package Array;

public class BestTimeToBuyAndSellStock {
	
	//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
	
	public static int maxProfit(int[] prices ){
		int buy_price = prices[0];
		int max_profit =0;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i]<buy_price) {
				buy_price = prices[i];
			}else {
				int current_profit = prices[i]-buy_price;
				max_profit= Math.max(max_profit, current_profit);
			}
		}
		return max_profit;
	}

	public static void main(String[] args) {
		 int prices[] = {1,2,3,4,5};
		 System.out.println(maxProfit(prices));

	}

}
