package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class JoinStringWithPrefixSuffixDelimter_18 {

	public static void main(String[] args) {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinedstr = listOfStrings.stream().collect(Collectors.joining( "," , "[",  "]" ));
		System.out.println(joinedstr);
		
		StringJoiner joinNames = new StringJoiner(",", "[", "]"); 
		listOfStrings.forEach(s-> joinNames.add(s));
		System.out.println(joinNames);
		
	}

}
