package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 The map() method in Java Streams API is a powerful intermediate operation that transforms each element 
in the stream using a provided function. This method is essential for data transformation tasks,
allowing developers to apply operations that can convert or modify elements efficiently within a stream. 
map() applies a function to each element of the stream and returns a stream consisting of the results.
It is used for transforming data without altering the size of the stream.
After map() method,use a terminal operation to collect and display the results
*/
public class StreamMap_12 {

	public static void main(String[] args) {
		
		List<String> words = Arrays.asList("hello", "world", "stream", "java");
		List<String> upperCaseWords = words.stream().map(e->e.toUpperCase()).collect(Collectors.toList());
		/*List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()); */
		upperCaseWords.forEach(System.out::println);
		             
		                         

	}

}
