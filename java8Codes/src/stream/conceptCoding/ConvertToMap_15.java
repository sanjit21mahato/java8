package stream.conceptCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertToMap_15 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
		Map<Integer, Integer> map =list.stream().map((e)->e*1).collect(Collectors.toMap((k)->k, (x)->x));
         map.forEach((k,v)->{
        	 System.out.println(k +":"+ v);
             
         });
	}

}
