package java8.stream.terminals;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		// Print each elements of a list of strings with prefix "Subject: "
		
		List<String> books = Arrays.asList("Math", "Physics", "Chemistry", "English", "Hindi");
		
		books.stream()
		.forEach(b-> System.out.println("Subject: "+b));
		//Subject: Math
		//Subject: Physics
		//Subject: Chemistry
		//Subject: English
		//Subject: Hindi

	}

}
