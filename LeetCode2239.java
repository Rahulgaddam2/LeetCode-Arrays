package Arrays;

public class LeetCode2239 {

	public static void main(String[] args) {
		
		LeetCode2239 object = new LeetCode2239();
		
		int[] arr = {1,2,3,4,5};
		int[] arr1 = {-1,-1,1,2,-2,-2};
		int[] arr2 = {-1,-1,1,2,-2,-2};
		int[] arr3 = {200, 5000 , 50 , -50 };
		
		System.out.println("Closest to zero in arr: " + object.method(arr));
		System.out.println("Closest to zero in arr: " + object.method(arr1));
		System.out.println("Closest to zero in arr: " + object.method(arr2));
		System.out.println("Closest to zero in arr: " + object.method(arr3));
	}
	
	public int method(int[] arr) {
		
		int result = Integer.MAX_VALUE;
		
		for(int i : arr) {
			if(Math.abs(i) < Math.abs(result) || Math.abs(i) == Math.abs(result) && i > result){
				result = i;
			}

		}
		return result;
	}

}
