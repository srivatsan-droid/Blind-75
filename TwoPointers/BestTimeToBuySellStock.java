public class BestTimeToBuySellStock {
	public static int maxProfit(int nums[]) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for(int i = 0;i < nums.length;i++) {
			if(nums[i] <  min) {
				min = nums[i];
			}
			int profit = nums[i] - min;
			max = Math.max(max,profit);
		}
		return max;
	}
	public static void main(String[] args) {
		int nums[] = {7,1,5,3,6,4};
		int ans = maxProfit(nums);
		System.out.println(ans);
	}
}