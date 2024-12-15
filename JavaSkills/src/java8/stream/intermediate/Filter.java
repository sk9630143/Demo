package java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		List<Integer> filtered = numbers.stream().filter(n-> n>5).collect(Collectors.toList());
		System.out.println(filtered);//[6, 7, 8, 9, 10]

	}
}
