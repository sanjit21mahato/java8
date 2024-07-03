package lambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		 int i= list.stream().max((e1,e2)->e1.compareTo(e2)).get();
		System.out.println(i);
	}

	
}
