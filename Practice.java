package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.*;

public class Practice {

	public static void main(String[] args) {
		
		Vector v1 = new Vector();
		
		System.out.println(v1);
	
		ArrayList<Integer> List1 = new ArrayList<>(Arrays.asList(2,4,6,7,8,9,6,4,3));
		
		System.out.println("Max number of the array is" + Collections.max(List1));
		
		Collections.shuffle(List1);
		System.out.println(List1);
		
		
		int frequency = Collections.frequency(List1, 4);
		System.out.println(frequency);
		
		// converting array to arraylist
		String[] animals = {"cat", "dog", "tiger","cow"};
		ArrayList<String> animalslist = new ArrayList<>(Arrays.asList(animals));
		animalslist.add("lion");
		System.out.println("animalslist "+ animalslist);
		
		//converting arraylist to array
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        
        Integer[] array = numbers.toArray(new Integer[0]);
        
        
        ArrayList<String> places = new ArrayList<>();
       
        
        places.add("Hyderabad");
        places.add("Usa");
        places.add("India");
        
        String[] array1 = places.toArray(new String[0]);
        System.out.println(places);
		
		// reverse the array
		String[] names = {"rahul","bunny","sushma","shankar","anjavva"};
		Collections.reverse(Arrays.asList(names));
		System.out.println("reverse of the array "+ Arrays.toString(names));
		
		// removing all occurrences from an list
		List1.removeAll(Collections.singleton(4));
		System.out.println(List1);
		
		Integer[] array3 = {1,2,3,4,5,6,7,8,9,0};
		
		ArrayList<Integer> arraylist = new ArrayList<>(Arrays.asList(array3));
		
		
		
		
	}

}
