package Arrays;

public class LeetCode45 {

	public static void main(String[] args) {
		LeetCode45 Object = new LeetCode45();
		
		int[] nums = {2,3,0,1,4};
		
		System.out.println(Object.jump(nums));

	}
	public int jump(int[] nums) {
		int totaljumps = 0;
		int destination = nums.length-1;
		int coverage = 0;
		int lastjump=0;
		
		if(nums.length == 1) {
			return 0;
		}
		
		for(int i=0;i<nums.length;i++) {
			coverage = Math.max(coverage, i+nums[i]);
			
			if(i==lastjump) {
				lastjump = coverage;
				totaljumps++;
			}
			
			if(lastjump >= destination) {
				break;
			}
		}
		return totaljumps;
	}

}
