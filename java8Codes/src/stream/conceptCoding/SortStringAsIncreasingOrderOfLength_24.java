package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAsIncreasingOrderOfLength_24 {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Java", "C++","Python", "Kotlin");
		listOfStrings.stream().sorted((e1,e2)->e1.length()-e2.length()).collect(Collectors.toList()).forEach(System.out::println);; 
	}

}
