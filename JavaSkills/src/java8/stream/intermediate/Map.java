package java8.stream.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Map {

	public static void main(String[] args) {
		// map
		
		List<String> words = Arrays.asList("apple", "banana", "cherry", "guava");
		
		List<String> upperCase =  words.stream().map(String::toUpperCase)
		.collect(Collectors.toList());
		System.out.println("UpperCase: "+upperCase);//UpperCase: [APPLE, BANANA, CHERRY, GUAVA]

		
		List<IntStream> result = words.stream().map(w -> w.chars())
				.collect(Collectors.toList());
		result.forEach(c-> System.out.println(c.toString()));
		//java.util.stream.IntPipeline$Head@880ec60
		//java.util.stream.IntPipeline$Head@3f3afe78
		//java.util.stream.IntPipeline$Head@7f63425a
		//java.util.stream.IntPipeline$Head@36d64342
		
	}

}
