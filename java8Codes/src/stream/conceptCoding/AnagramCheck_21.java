package stream.conceptCoding;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramCheck_21 {

	public static void main(String[] args) {
		String s1 = "RaceCar";
        String s2 = "CarRace";
        
        System.out.println(Arrays.toString(s1.split("")));
        
        String s3 =Stream.of(s1.split("")).map((s)->s.toUpperCase()).sorted().collect(Collectors.joining());
        String s4 =Stream.of(s2.split("")).map((s)->s.toUpperCase()).sorted().collect(Collectors.joining());
        
        if(s3.equals(s4)){
        	System.out.println("Anagram");
        }else{
        	System.out.println("NotAnagram");
        }
	}

}
