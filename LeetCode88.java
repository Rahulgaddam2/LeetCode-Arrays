package Arrays;

public class LeetCode88 {

    public static void main(String[] args) {
        LeetCode88 Object = new LeetCode88();
        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        
        Object.MergeSortedarray(nums1, m, nums2, n);
        
        
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
    }
    
    public void MergeSortedarray(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p3 = nums1.length - 1;
        
        while (p3 >= 0) {
            int element1 = (p1 >= 0) ? nums1[p1] : Integer.MIN_VALUE;
            int element2 = (p2 >= 0) ? nums2[p2] : Integer.MIN_VALUE;
            
            if (element1 > element2) {
                nums1[p3] = element1;
                p3--;
                p1--;  
            } else {
                nums1[p3] = element2;
                p3--;
                p2--;  
            }
             
        }
    }
}
