package java8.stream.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		// Sort a list of names in reverse alphabetical order
		List<String> names = Arrays.asList("Sushil", "Kumar", "Sujeet", "Ram", "Ajit");
		List<String> reverseOrder = names.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println("Name: "+names); //Name: [Sushil, Kumar, Sujeet, Ram, Ajit]
		System.out.println("ReverseInOrder: "+reverseOrder);//ReverseInOrder: [Sushil, Sujeet, Ram, Kumar, Ajit]
		

	}

}
