package java8.stream.intermediate;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) {
		// Given a list of lists of strings, flatten them into a single list of strings.

		List<List<String>> listOfLists = Arrays.asList(
					Arrays.asList("India", "Dubai"),
					Arrays.asList("USA", "Abu Dhabi")
				);
		
		List<String> flatMapList = listOfLists.stream().flatMap(list-> list.stream())
											           .collect(Collectors.toList());
		
		System.out.println("Input: "+listOfLists);//Input: [[India, Dubai], [USA, Abu Dhabi]]
		System.out.println("Output: "+flatMapList);//Output: [India, Dubai, USA, Abu Dhabi]

		//Second Approach
		List<String> secondApproach = listOfLists.stream()
				.flatMap(Collection::stream)
		        .collect(Collectors.toList());
		System.out.println("Output-2: "+secondApproach);//Output-2: [India, Dubai, USA, Abu Dhabi]

	}

}
