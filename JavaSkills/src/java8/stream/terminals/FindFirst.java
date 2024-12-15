package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirst {

	public static void main(String[] args) {
		// Find first element in a list that starts with letter b		
		List<String> cities = Arrays.asList("Lucknow", "Delhi", "Kanpur", "Noida", "Gurugram", "Kerla");
		Optional<String> output = cities.stream()
				.filter(city-> city.startsWith("K"))
				.findFirst();
		System.out.println(output);//Optional[Kanpur]
		
		//Find integers starts with 2
		List<Integer> input = Arrays.asList(12,34,29,42,26,56,72,91,21,32);
		Optional<String> startWith2 = input.stream()
				.map(num-> num+"")
				.filter(num-> num.startsWith("2"))
				.findFirst();
		System.out.println("StartsWith2: "+startWith2); //StartsWith2: Optional[29]
		
		Optional<String> endWith1 = input.stream()
				.map(num-> num+"")
				.filter(num-> num.endsWith("1"))
				.findFirst();
		System.out.println("endWith1: "+endWith1); //endWith1: Optional[91]

	}

}
