package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class ConvertStreamToArray_3 {

	public static void main(String[] args) {
		
		Stream<String> stream = Stream.of("a","b","c");
		String arr[] = stream.toArray(size-> new String[size]);
		Arrays.stream(arr).forEach(System.out::println);

	}

}
