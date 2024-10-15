package Arrays;

import java.util.Arrays;

public class LeetCode14 {

	public static void main(String[] args) {
		LeetCode14 object = new LeetCode14();
		
		String[] strs = {"flower","flow","flight"};
		
		System.out.println(object.longestCommonPrefix(strs));

	}
	
	public String longestCommonPrefix(String[] strs) {
		
		StringBuilder result = new StringBuilder();
		
		Arrays.sort(strs); // used to sort an array , for this you need java.util.arrays package
		
		char [] first = strs[0].toCharArray(); 
		char [] last = strs[strs.length-1].toCharArray();
		
		for(int i=0 ; i < first.length ; i++) {
			if(first[i] != last[i]) 
				break;
				result.append(first[i]);
			
		}
		return result.toString();
	}

}
