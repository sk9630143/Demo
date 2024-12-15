package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinAndMax {

	public static void main(String[] args) {
		// Find the maximum and Minimum value from the list
		
		List<Integer> input = Arrays.asList(5,2,7,9,23,43,17);
		Optional<Integer> max = input.stream().max(Integer::compareTo);
		System.out.println("Max: "+max);//Max: Optional[43]
		
		Optional<Integer> min = input.stream().min(Integer::compareTo);
		System.out.println("Min: "+min);//Min: Optional[2]

	}

	/*
	 	`**max**`** and **`**min**`  
			used to find the maximum and minimum elements in a stream, respectively, 
			based on a given comparator or natural ordering. 
			These methods return an `Optional` because the stream might be empty.

	 	**Return Type:** Both methods return an `Optional<T>` to handle the case 
	 	*where the stream might be empty.
	 */
}
