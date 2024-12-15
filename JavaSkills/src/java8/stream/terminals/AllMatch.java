package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;

public class AllMatch {
	

	public static void main(String[] args) {
		// Check if all numbers in list are positive
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);		
		boolean isAllPositive = numbers.stream()
								.allMatch(num-> num > 0);//allMatch(Using Predicate method)
		
		System.out.println("isAllPositive: "+isAllPositive);//isAllPositive: true
		
		boolean isGreaterThanOne = numbers.stream()
				.allMatch(num-> num > 1);
		System.out.println("isGreaterThanOne: "+isGreaterThanOne);//isGreaterThanOne: false

		
	}
	
	/*
	 * The `allMatch` method in Java Streams is used to check if all elements in the stream satisfy a given predicate. 
	 * It returns `true` if every element in the stream matches the predicate, and `false` otherwise.

	 **Short-Circuiting:** The `allMatch` operation is short-circuiting, 
	 * meaning it stops processing as soon as it finds the first element that does not match the predicate. 
	 *If it finds such an element, it immediately returns `false`.
	 */
}
