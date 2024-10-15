// Explained what is StringBuilder in the bottom
package Arrays;

public class LeetCode1768 {
	public static void main(String[] args) {
		
		LeetCode1768 object = new LeetCode1768();
		
		String word1 = "abc";
		String word2 = "rah";
		
		System.out.println(object.method(word1, word2));
		
	}
	
	public String method(String word1 , String word2) {
		
		StringBuilder merged = new StringBuilder();
		
		int i=0;
		
		while(i < word1.length() || i < word2.length()) {
			if(i < word1.length()) {
				merged.append(word1.charAt(i));
			}
		if(i < word2.length()) {
			merged.append(word2.charAt(i));
		}
		i++;
		
		
		
	}
		return merged.toString();
	
}
}

//what is stringbuilder?

/*public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object with initial content
        StringBuilder sb = new StringBuilder("Hello");

        // Append text to the end
        sb.append("World");
        System.out.println(sb); // Output: Hello World

        // Insert text at a specific index
        sb.insert(6, "Beautiful ");
        System.out.println(sb); // Output: Hello Beautiful World

        // Delete text from a specific range
        sb.delete(6, 16);
        System.out.println(sb); // Output: Hello World

        // Replace text in a specific range
        sb.replace(6, 11, "Java");
        System.out.println(sb); // Output: Hello Java

        // Reverse the content
        sb.reverse();
        System.out.println(sb); // Output: avaJ olleH

        // Convert to String
        String finalString = sb.toString();
        System.out.println(finalString); // Output: avaJ olleH
    }
}*/
