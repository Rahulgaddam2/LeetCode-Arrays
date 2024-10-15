package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode56 {

	public static void main(String[] args) {
		LeetCode56 object = new LeetCode56();
		
		int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		
		 int[][] mergedIntervals = object.method(intervals);
		
		
		System.out.println(" non-overlapping intervals that cover all the intervals in the input "+  Arrays.deepToString(mergedIntervals));

	}
	
	public int[][] method(int[][] intervals){
		
		Arrays.sort(intervals, (arr1 , arr2) -> arr1[0] - arr2[0]); //sorts a two-dimensional array called intervals based on the first element of each sub-array
		
		List<int[]> result = new ArrayList<>();
		int[] current = intervals[0];
		result.add(current);
		
		
		
		for(int i=1 ; i<intervals.length; i++) {
			int [] interval = intervals[i];
			
			if(current[1] >= interval[0]) {
				current[1] = Math.max(current[1], interval[1]);
			}else {
				current = interval;
				result.add(current);
			}
		}
		
		
		return result.toArray(new int[result.size()][]);
	}

}
