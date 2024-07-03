package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
The flatMap() method in Java Streams is used to flatten complex structures into simpler and more usable forms.
This method is particularly useful when working with streams of arrays, collections, or any structures 
that contain nested elements. It combines elements from these nested structures into a single stream, 
making it easier to perform further operations without dealing with complexity.

1. flatMap() converts each element of the stream into another stream and then concatenates these streams 
into a single stream.
2. This method is essential for handling nested collections or arrays effectively within a stream.
3. It is often used in conjunction with map() for comprehensive data transformation tasks.
*/
public class StreamFlatMap_13 {

	public static void main(String[] args) {
		 List<List<String>> listOfLists = Arrays.asList(
		            Arrays.asList("Apple", "Banana"),
		            Arrays.asList("Carrot", "Daikon"),
		            Arrays.asList("Eggplant", "Fig")
		        );
		 
		 List<String> flatList= listOfLists.stream().flatMap(list->list.stream()).collect(Collectors.toList());
		 flatList.forEach(System.out::println);
		 
		/* List<String> flatList = listOfLists.stream()
                 .flatMap(List::stream)
                 .collect(Collectors.toList());*/
		 
		 
		 
		 
	}

}
