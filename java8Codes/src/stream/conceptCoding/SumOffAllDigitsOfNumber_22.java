package stream.conceptCoding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOffAllDigitsOfNumber_22 {

	public static void main(String[] args) {

		int n = 12345;
	
		Integer sum =  Stream.of(String.valueOf(n).split("")).collect(Collectors.summingInt((e)->Integer.parseInt(e)));
	    System.out.println(sum);
	}

}
