package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;

public class NonMatch {

	public static void main(String[] args) {
		// Check if no elements in a list are negative
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
		boolean isNegativeNumber = numbers.stream()
				.noneMatch(num-> num > 0);
		System.out.println("isNegativeNumber: "+isNegativeNumber);//isNegativeNumber: false

	}

	/*
	 	The `noneMatch` method in Java Streams is used to check 
	 	if **no elements** in the stream match a given predicate. 
	 	It returns `true` if none of the elements satisfy the predicate and `false` 
	 	if at least one element does.

        Like `allMatch` and `anyMatch`, `noneMatch` is short-circuiting. 
        It stops processing as soon as it finds the first element that matches 
        the predicate and immediately returns `false` 
	 */
}
