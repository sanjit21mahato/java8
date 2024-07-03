package stream.conceptCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirst_14 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(11,2,13,4,5,6));
		
		int first=list.stream().filter((e)->e>12).findFirst().get();
		System.out.println(first);

	}

}
