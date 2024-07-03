package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumAndAverageOfAllElements_26 {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(4,6,5);
		int sum= listOfIntegers.stream().collect(Collectors.summingInt(e->e));
		System.out.println(sum);
		int sum1 = listOfIntegers.stream().reduce(0, (e1,e2)->e1+e2);
		System.out.println(sum1);
       // listOfIntegers.stream().
		
		
		int avg= listOfIntegers.stream().collect(Collectors.averagingInt(e->e)).intValue();
		System.out.println(avg);

	}

}
