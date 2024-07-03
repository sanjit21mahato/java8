package stream.conceptCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ThreeMaxThreeMin_20 {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("Three Minimum:");
		listOfIntegers.stream().sorted((e1,e2)->e1-e2).limit(3).forEach(System.out::println);
        System.out.println("Three Maximum");
        listOfIntegers.stream().sorted((e1,e2)->e2-e1).limit(3).forEach(System.out::println);
	}

}
