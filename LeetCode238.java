package Arrays;

import java.util.Arrays; 

public class LeetCode238 {

    public static void main(String[] args) {
        LeetCode238 object = new LeetCode238();
        
        int[] array = {1, 2, 3, 4};
        
       
        int[] result = object.method(array);
        
        
        System.out.println("Product of array except self = " + Arrays.toString(result));
    }
    
    public int[] method(int[] array) {
        
        int[] left = new int[array.length];
        int[] right = new int[array.length];
        
        left[0] = 1;
        for (int i = 1; i < array.length; i++) {
            left[i] = array[i - 1] * left[i - 1];
        }
        
        right[array.length - 1] = 1;
        for (int i = array.length - 2; i >= 0; i--) {
            right[i] = array[i + 1] * right[i + 1];
        }
        
        int[] ans = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            ans[i] = left[i] * right[i];
        }
        
        return ans;
    }
}
