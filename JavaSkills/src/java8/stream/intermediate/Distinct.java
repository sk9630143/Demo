package java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {

	public static void main(String[] args) {
		//Remove duplicates from a list of integers or string
		
		List<Integer> input = Arrays.asList(1,3,2,4,2,5,3);
		List<Integer> output = input.stream()
				.distinct()   //remove duplicates
				.collect(Collectors.toList());
		
		System.out.println("Input: "+input); //Input: [1, 3, 2, 4, 2, 5, 3]
		System.out.println("Output: "+output);//Output: [1, 3, 2, 4, 5]
		
	}
}
