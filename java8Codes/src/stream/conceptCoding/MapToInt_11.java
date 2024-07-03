package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MapToInt_11 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,4,4,5};
		IntStream intstream = Arrays.stream(arr);
		int disticntArr[]= intstream.filter((int e)->e>3).toArray();
		System.out.println(Arrays.toString(disticntArr));
		
		List<String> list = Arrays.asList("1","5","2","7","4");
		IntStream intStream = list.stream().mapToInt((String s)->Integer.parseInt(s));
	}

}
