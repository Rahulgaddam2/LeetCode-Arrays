package Arrays;

public class LeetCode122 {

	public static void main(String[] args) {
        
		LeetCode122 Object = new LeetCode122();
		
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println("max profit is" + " " +	 Object.maxProfit(prices));

	}
	public int maxProfit(int[] prices) {
		int maxprofit = 0;
		
		for(int i=1;i<prices.length;i++) {
			if(prices[i] > prices[i-1]) {
				maxprofit = maxprofit + (prices[i] - prices[i-1]);	
			}
		}
		return maxprofit;
	}

}
