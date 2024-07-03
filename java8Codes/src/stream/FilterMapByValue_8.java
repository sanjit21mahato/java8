package stream;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterMapByValue_8 {

	public static void main(String[] args) {
		Map<String, String> hmap = new HashMap<>();

        hmap.put("de", "Germany");
        hmap.put("hu", "Hungary");
        hmap.put("sk", "Slovakia");
        hmap.put("si", "Slovenia");
        hmap.put("so", "Somalia");
        hmap.put("us", "United States");
        hmap.put("ru", "Russia");
        
        hmap.entrySet().stream().filter(map->map.getValue().equalsIgnoreCase("Russia")).forEach(System.out::println);

        //hmap.entrySet().stream().filter(map->map.getValue().equalsIgnoreCase("Russia")).collect(Collectors.toMap(p -> p[0], p -> p[1]);

	}

}
