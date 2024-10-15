package Arrays;

public class Leetcode27 {

	public static void main(String[] args) {
		Leetcode27 Object = new Leetcode27();
		
		int[] nums = {3,2,2,3};
		int val = 3;
		
		System.out.println(Object.removeElement(nums, val));
		
		int newlength = Object.removeElement(nums, val);
		
		System.out.println("New length: " + newlength);
		
		for(int i=0;i<newlength;i++) {
			System.out.print(nums[i] + " ");
		}
		
	}
	public int removeElement(int[] nums, int val) {
		int count = 0;
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}

}
