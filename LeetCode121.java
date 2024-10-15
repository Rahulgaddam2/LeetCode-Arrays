package Arrays;

public class LeetCode121 {

	public static void main(String[] args) {
		
		LeetCode121 Object = new LeetCode121();
		
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println("max profit is" + " " +	 Object.maxProfit(prices));
		

	}
	
	public int maxProfit(int[] prices) {
		// this problem is dynamic programming
		int buyprize = prices[0];
		int maxprofit = 0;
		
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i] < buyprize) {
				buyprize = prices[i];
			}else {
				int currentprize = prices[i] - buyprize;
				maxprofit = Math.max(maxprofit, currentprize);
			}
		}
		return maxprofit;
	}
}
