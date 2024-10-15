package Arrays;

public class LeetCode169 {

	public static void main(String[] args) {
		LeetCode169 Object = new LeetCode169();
		
		int[] nums = {2,2,1,1,1,2,2};
		System.out.println(Object.majorityElement(nums));
	}
	//Moore's Voting Algorithm
	public int majorityElement(int[] nums) {
			int mejority = nums[0];
			int vote = 1;
			
			for(int i=1;i<nums.length;i++) {
				if(vote == 0) {
					vote++;
					mejority = nums[i];
				}else if(mejority == nums[i]){
					vote++;
				}else {
					vote--;
				}
				
			}
			return mejority;
	}

}
