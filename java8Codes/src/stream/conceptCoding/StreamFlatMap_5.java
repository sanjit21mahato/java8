package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFlatMap_5 {

	public static void main(String[] args) {
		List<List<Integer>> intComplexList = Arrays.asList(  
				Arrays.asList(1,2,3,4), Arrays.asList(5,6,7));
		Stream<Integer> streamInt = intComplexList.stream().flatMap((List<Integer> fl)->fl.stream());
		//O/P: 1,2,3,4,5,6,7
		List<Integer> flatList= intComplexList.stream().flatMap(list->list.stream()).map((i)->i*i).collect(Collectors.toList());
		flatList.forEach(System.out::println);
		
		List<List<String>> stringComplexList = Arrays.asList(  
				Arrays.asList("Hello", "World"), Arrays.asList("Welcome","Back"));
		List<String> list = stringComplexList.stream().flatMap((List<String> strList)-> strList.stream()).map((s)->s.toUpperCase()).collect(Collectors.toList());
	}

}
