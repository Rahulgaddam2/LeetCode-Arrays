package Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeetCode228 {

	public static void main(String[] args) {
		
		LeetCode228 object = new LeetCode228();
		
		int [] array = {0,1,2,4,5,7};
		
		System.out.println("The summary range is "+ object.summaryRanges(array));
		

	}
	
	public List<String> summaryRanges(int [] array){
		
		ArrayList<String> result = new ArrayList<>();
		
		int start = array[0];
		int end = array[0];
		
		for(int i=1; i < array.length ; i++) {
			if(end+1 == array[i]) {
				end = array[i];
			}else {
				if(start == end) {
					result.add(Integer.toString(start));
				}else {
					result.add(start+ " -> "+end);
				}
				start = array[i];
                end = array[i];
			}
			
		}
		if(start==end){
            result.add(Integer.toString(start));
        }else{
            result.add(start + "->" + end);
        }
        return result;
		
		
	}

}
