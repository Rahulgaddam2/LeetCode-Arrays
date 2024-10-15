package Arrays;

public class LeetCode392 {

	public static void main(String[] args) {
		
		LeetCode392 object = new LeetCode392();
		
		String a = "abc";
		String b = "ahckvjs";
		
		System.out.println(object.isSubsequence(a, b));
		

	}
	
	public boolean isSubsequence(String a , String b) {
		
		if(a.length() == 0) {
			return true;
		}
		
		int i =0;
		int j =0;
		
		while(i < a.length() && j < b.length()) {
			if(a.charAt(i)== b.charAt(j) ) {
				i++;
				j++;
			}else {
				j++;
			}
		}
		if(i == a.length()) {
			return true;
		}else {
			return false;
		}
		
		
		
	}

}
