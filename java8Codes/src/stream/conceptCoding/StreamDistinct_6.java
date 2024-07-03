package stream.conceptCoding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDistinct_6 {

	public static void main(String[] args) {

       int arr[] = {1,2,2,3,4,4,5};
       int arrDistinct[]= Arrays.stream(arr).distinct().toArray();
       System.out.println(Arrays.toString(arrDistinct));

	}

}
