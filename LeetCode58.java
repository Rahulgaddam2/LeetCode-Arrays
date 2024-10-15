package Arrays;

public class LeetCode58 {

	public static void main(String[] args) {
		LeetCode58 Object = new LeetCode58();
		
		String s = "Hello World";
		
		System.out.print(Object.lengthOfLastWord(s));

	}
	public int lengthOfLastWord(String s) {
        int count =0;
        
        for(int i=s.length()-1;i>=0;i--) {
        	if(s.charAt(i) != ' ') {
        		count++;
        	}else {
        		if(count>0) {
        			return count;
        		}
        	}
        }
        return count;
    }

}
