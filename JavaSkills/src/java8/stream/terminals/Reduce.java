package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reduce {

	public static void main(String[] args) {
		// Compute the product (multiply) of all numbers in a list
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		Optional<Integer> sumOfProduct = numbers.stream().reduce((x,y)-> x*y);
		
		System.out.println(sumOfProduct.get());//120
		
		Optional<Integer> sumOfAll = numbers.stream()
				.reduce((x,y)-> x+y );
		System.out.println("Sum: "+sumOfAll);
	}

}
