package java17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Var {

	public static void main(String[] args) throws IOException {
		// var demo
		
		var reader = new InputStreamReader(System.in);
		var br = new BufferedReader(reader);
		var names = new ArrayList<>();
		System.out.println("Enter names here.... ");
		names.add(br.readLine());
		names.add(br.readLine());
		
		System.out.println("Output: "+names);
		
		/*
			Enter names here.... 
			"Kumar"
			"John"
			Output: ["Kumar", "John"]

		 */

	}

}
