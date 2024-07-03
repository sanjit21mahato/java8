package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamListSorting_2 {

	public static void main(String[] args) {
		List<String>fruits = new ArrayList();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        
        //Ascending Sorting
        List<String>fruitsSorted=  fruits.stream().sorted().collect(Collectors.toList());
        fruitsSorted.forEach(System.out::println);
        
        //Descending Sorting
        List<String>fruitsSortedDescending=  fruits.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        fruitsSortedDescending.forEach(System.out::println);
        //Descending Sorting
        List<String>fruitsSortedDescending1=  fruits.stream().sorted((e1,e2)->e2.compareTo(e1)).collect(Collectors.toList());
        fruitsSortedDescending1.forEach(System.out::println);
	}

}
