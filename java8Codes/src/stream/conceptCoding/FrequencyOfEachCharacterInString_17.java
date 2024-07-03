package stream.conceptCoding;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FrequencyOfEachCharacterInString_17 {

	public static void main(String[] args) {
	    String str ="Hello";
        Map<Character, Long> map=  str.chars().mapToObj((c-> (char)c)).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));	
       // Map<String, Long> map1=  Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));	
        map.forEach((k,v)-> {
        	System.out.println(k +":"+ v);
        });
	}

}
