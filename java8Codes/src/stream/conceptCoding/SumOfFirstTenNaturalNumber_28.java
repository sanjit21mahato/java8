package stream.conceptCoding;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfFirstTenNaturalNumber_28 {

	public static void main(String[] args) {

     int sum =IntStream.range(1, 11).sum();
     System.out.println(sum); 
     // Stream.generate(s)
      long sum1= Stream.iterate(1, (e)->1+e).limit(10).collect(Collectors.summingLong(e->e)).longValue();
      System.out.println(sum1);

	}

}
