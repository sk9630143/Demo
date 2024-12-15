package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

	public static void main(String[] args) {
		// Collect a list of integers into a Set
		//Remove duplicates from the List
		
		List<Integer> listOfIntegers = Arrays.asList(1,2,4,3,4,5,1);
		Set<Integer> setOfIntegers = listOfIntegers.stream()
				.collect(Collectors.toSet());//duplicates filtered
		
		System.out.println("ListOfIntegers: "+listOfIntegers);//[1, 2, 4, 3, 4, 5, 1]

		System.out.println("SetOfIntegers: "+setOfIntegers);//[1, 2, 3, 4, 5]
		

	}

}
