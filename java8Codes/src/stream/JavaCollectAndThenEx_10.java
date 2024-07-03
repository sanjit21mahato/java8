package stream;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class JavaCollectAndThenEx_10 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(200, 300, 100);
		double avg = list.stream().collect(Collectors.averagingDouble(Integer::intValue));
		System.out.println(avg);
		
		//calculate an average price and then formats
		/*double avgPrice = list.stream().collect(Collectors.collectingAndThen(
                Collectors.averagingInt(Integer::intValue),
                avg -> NumberFormat.getCurrencyInstance(new Locale("en", "US"))
                
				);
                
        */
	}

}
