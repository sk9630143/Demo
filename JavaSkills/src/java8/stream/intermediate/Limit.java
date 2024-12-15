package java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Limit {
	
	public static void main(String[] args) {
		//Fetch first 3 elements from a list of integers
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> first3Numbers = numbers.stream()
				.limit(3)
				.collect(Collectors.toList());
		System.out.println(first3Numbers);//[1, 2, 3]
	}
}
