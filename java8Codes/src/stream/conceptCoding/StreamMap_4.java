package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap_4 {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("Hello", "Filter", "Operation");
		Stream<String> streamString = stringList.stream().map((str)-> str.toUpperCase());
		List<String> stringTransList = streamString.collect(Collectors.toList());
		System.out.println(stringTransList);
	}

}
