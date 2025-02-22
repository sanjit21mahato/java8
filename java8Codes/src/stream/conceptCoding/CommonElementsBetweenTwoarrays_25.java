package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoarrays_25 {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        
        list1.stream().filter((e)->list2.contains(e)).collect(Collectors.toList()).forEach(System.out::println);;

	}

}
