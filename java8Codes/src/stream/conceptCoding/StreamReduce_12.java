package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;

public class StreamReduce_12 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		int arrsum =list.stream().reduce((val1, val2)->val1+val2).get();
		System.out.println(arrsum);
		int sum =list.stream().reduce(10, (val1, val2)-> val1+val2).intValue();
		System.out.println(sum);

	}

}
