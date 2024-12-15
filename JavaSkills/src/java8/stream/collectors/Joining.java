package java8.stream.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Joining {

	public static void main(String[] args) {
		// Concatenate all strings in a list into a single string separated by comma (,)
		
		List<String> input = Arrays.asList("Lucknow", "Delhi", "Kanpur", "Noida", "Gurugram", "Kerla");
		
		String j1 =  input.stream()
                .collect(Collectors.joining());
        System.out.println("J1: "+j1);//J1: LucknowDelhiKanpurNoidaGurugramKerla

        String j2 = input.stream()
        		.collect(Collectors.joining(", "));
        System.out.println("J2: "+j2);// J2: Lucknow, Delhi, Kanpur, Noida, Gurugram, Kerla
        
        String j3 = input.stream()
        		.collect(Collectors.joining(", ", "[ ", " ]"));
        System.out.println("J3: "+j3);//J3: [ Lucknow, Delhi, Kanpur, Noida, Gurugram, Kerla ]
	}

}
