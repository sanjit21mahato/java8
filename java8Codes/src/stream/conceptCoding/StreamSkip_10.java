package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;

public class StreamSkip_10 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,2,7,4);
		list.stream().skip(2).forEach(System.out::println);
	}

}
