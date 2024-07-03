package stream.conceptCoding;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordOfString_27 {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String rev=Stream.of(str.split(" ")).map( (e)-> new StringBuffer(e).reverse()).collect(Collectors.joining(" "));
		System.out.println(rev);	
	

	}

}
