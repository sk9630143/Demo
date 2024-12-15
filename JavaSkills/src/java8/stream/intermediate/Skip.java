package java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Skip {

	public static void main(String[] args) {
		// Skip the first 4 elements and fetch the remaining elements from a list of integers
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> skipElements = numbers.stream()
				.skip(4)
				.collect(Collectors.toList());
		
		System.out.println("skipFirst4Elements: "+skipElements);//[5, 6, 7, 8, 9, 10]

	}

}
