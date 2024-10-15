package Arrays;

public class LeetCode48 {

	public static void main(String[] args) {
		
		LeetCode48 object = new LeetCode48();
		
		int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
		
		object.method(array);

        // Print the rotated array
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");

	}
}      
	public void method(int[][] array){
		
		int len = array.length;
		
		for(int i=0; i<len; i++) {  // here we are doing transpose of array switching rows to columns and columns to rows
			for(int j=i;j<len;j++) {
				int temp = array[i][j]; // this is same logic for any problem related to transpose of array
				array[i][j] = array[j][i];
				array[j][i] = temp;
			}
		}
		for(int i=0;i<len;i++) { // here we are reversing the array
			for(int j=0;j<len/2;j++) {
				int temp = array[i][j]; // same logic to reverse any array
				array[i][j] = array[i][len-j-1];
				array[i][len-j-1] = temp;
			}
		}
		
		
		
	}

}
