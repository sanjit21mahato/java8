package stream.conceptCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DifferentWaysToCreateStream_2 {

	public static void main(String[] args) {

		// from collection
		List<Integer> salaryList = Arrays.asList(5000, 4000, 7000, 9000, 3000);
		Stream<Integer> streamList = salaryList.stream();
		
		//from Array
		Integer arr[] = {5000, 4000, 7000, 9000, 3000};
		int arrPriitive[] ={1,2,3,4};
		
		Stream<Integer> streamArray = Arrays.stream(arr);
		IntStream streamArray1 = Arrays.stream(arrPriitive);
		
        //from static method
		Stream<Integer> streamStatic = Stream.of(arr);
		Stream<Integer> streamStaticD = Stream.of(10,20,30);
		
	   //from Stream Builder
		Stream.Builder<Integer> streamBuilder = Stream.builder();
		streamBuilder.add(10).add(20).add(30);
		Stream<Integer> streanBuild = streamBuilder.build();
		
		//From Stream Iterate
		Stream<Integer> streamItearte = Stream.iterate(100, (n->n+1)).limit(5); 
		
		
	}

}
