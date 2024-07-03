package stream.conceptCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorted_7 {

	public static void main(String[] args) {
		 int arr[] = {11,2,21,30,4,14,5};
		 List<Integer> list = Arrays.asList(1,5,2,7,4);
		 int sortedArr[] = Arrays.stream(arr).sorted().toArray();
		 System.out.println(Arrays.toString(sortedArr));
		 
		 //Arrays.stream(arr).sorted((Integer val1, Integer val2)-> val2-val1);
		

	}

}
