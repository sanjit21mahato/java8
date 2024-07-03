package stream.conceptCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxMin_13 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(11,2,13,4,5,6));
		long min = list.stream().min((e1,e2)->e1-e2).get();
        System.out.println(min);
        long max = list.stream().min((e1,e2)->e2-e1).get();
        System.out.println(max);
	}

}
