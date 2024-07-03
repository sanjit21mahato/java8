package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNullValues_7 {

	public static void main(String[] args) {
    List<String> list = Arrays.asList("Abc", "xyz", null, "kij");
    list = list.stream().filter(s->s!=null).collect(Collectors.toList());
    list.forEach(System.out::println);
    

	}

}
