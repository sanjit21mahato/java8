package stream.conceptCoding;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilter_3 {

	public static void main(String[] args) {
		
		Stream<String> streamString = Stream.of("Hello", "Filter", "Operation");
		Stream<String> filteredStream=streamString.filter((str)->str.length()>5);
		List<String> stringList = filteredStream.collect(Collectors.toList());
		System.out.println(stringList);

	}

}
