package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamCreationExamplesFromArray_1 {

	public static void main(String[] args) {
		
		

      Integer arr[] = {1,2,3,4,5};
      Stream<Integer> stream =  Arrays.stream(arr);
      stream.forEach(e-> {
    	  System.out.println(e);
      });
      
      String[] arr1 = new String[] { "a", "b", "c" };
      //Stream < String > stream5 = Stream.of(arr1);
      Stream<String> streamOfArrayFull = Arrays.stream(arr1);
      streamOfArrayFull.forEach(System.out::println);
      
      
	}

}
