package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;

public class AnyMatch {

	public static void main(String[] args) {
		// Check if any number in a list is greater than 15
		//At least one number is greater than 10
		
		List<Integer> numbers = Arrays.asList(5,2,8,12,15,17,9);
		boolean isGreaterThanTen = numbers.stream()
				.anyMatch(num-> num >10);//using Predicate functional interface
		System.out.println("isGreaterThanTen: "+isGreaterThanTen);//isGreaterThanTen: true

	}

	/*
		The `anyMatch` method checks whether **at least one element** in the stream matches a given predicate. 
		It returns `true` as soon as it finds an element that satisfies the predicate and 
		stops further processing. If no elements match, it returns `false` 
`    
        anyMatch` is short-circuiting, meaning it stops processing as soon as 
        it finds the first element that matches the predicate, optimizing performance.
	 */
}
