package java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
	
	/*
	 * The `peek` method in Java Streams is primarily used for debugging purposes. 
	 * It allows you to perform an intermediate operation on each element of the stream without modifying the stream itself.
	 * 
	 **peek:** The `peek` method is applied to the stream. It prints each word with the prefix "Original: " 
	 *The output of this method does not modify the elements; it only performs a side action (printing in this case).
	 */
	public static void main(String[] args) {
		// Print each element in a list while converting them to upper case
		List<String> input = Arrays.asList("apple", "guava", "cherry", "banana");
		List<String> output = input.stream()
				.peek(w-> System.out.println("OriginalWord: "+w))
				.map(String::toUpperCase)
				.collect(Collectors.toList());
		
		//OriginalWord: apple
		//OriginalWord: guava
		//OriginalWord: cherry
		//OriginalWord: banana
		System.out.println("input: "+input); //input: [apple, guava, cherry, banana]
		System.out.println("Output: "+output);//Output: [APPLE, GUAVA, CHERRY, BANANA]


	}

}
