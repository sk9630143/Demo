package java8.stream.terminals;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ToArray {

	public static void main(String[] args) {
		// Convert a list of string into an array
		
		List<String> cities = Arrays.asList("Lucknow", "Delhi", "Kanpur", "Noida", "Gurugram", "Kerla");
		
		String[] citiesArray = cities.stream().toArray(String[]::new);
		for (Iterator iterator = cities.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println("City: "+string);
			// City: Lucknow
			// City: Delhi
			// City: Kanpur
			// City: Noida
			// City: Gurugram
			// City: Kerla
		}

		Object[] obj = cities.stream().toArray();

		for (int i = 0; i < obj.length; i++) {
			System.out.println(i+" -> "+obj[i]);
			// 0 -> Lucknow
			// 1 -> Delhi
			// 2 -> Kanpur
			// 3 -> Noida
			// 4 -> Gurugram
			// 5 -> Kerla
		}

	}

}
