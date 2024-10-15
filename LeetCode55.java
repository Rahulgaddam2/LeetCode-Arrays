package Arrays;

public class LeetCode55 {

	public static void main(String[] args) {
		
		LeetCode55 Object = new LeetCode55();
		
		int[] nums = {2,3,1,1,4};
		
		System.out.println(Object.canJump(nums));
	}
	public boolean canJump(int[] nums) {
		int finalposition = nums.length-1;
		
		for(int i=nums.length-1;i>=0;i--) {
			if(i+nums[i] >= finalposition) {
				finalposition = i;
			}
		}
        return (finalposition == 0) ? true : false;
    }

}
