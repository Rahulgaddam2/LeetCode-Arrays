package Arrays;
import java.util.*;

public class LeetCode13 {

	public static void main(String[] args) {
		
		LeetCode13 obj = new LeetCode13();
		String s = "IIII";
		
		System.out.println(obj.method(s));

	}
	
	public int method(String s) {
		
		Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int result = map.get(s.charAt(s.length() - 1));
        
        for (int i = s.length() - 2; i >= 0; i--) {
            // If the current character is less than the next one, subtract its value
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                // Otherwise, add its value
                result += map.get(s.charAt(i));
            }
        }
        return result;
        
		
		
	}

}
