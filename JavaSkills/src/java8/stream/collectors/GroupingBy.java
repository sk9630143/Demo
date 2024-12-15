package java8.stream.collectors;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> cityMap = new HashMap();
		cityMap.put("max","dallas");
		cityMap.put("john","houston");
		cityMap.put("mike", "dallas");
		cityMap.put("eric","austin");
		cityMap.put("matt","austin");

		Map<String, List<String>> result = cityMap.entrySet().stream()
			.collect(Collectors.groupingBy(Map.Entry::getValue , 
					Collectors.mapping(Map.Entry::getKey,Collectors.toList())));

		System.out.println("result: "+result);
		//result: {dallas=[max, mike], houston=[john], austin=[matt, eric]}

	}

}
