package stream.conceptCoding;

import java.util.Arrays;
import java.util.List;

public class CountEmployeeWithCertainSalary_1 {

	public static void main(String[] args) {
		List<Integer> salaryList = Arrays.asList(5000, 4000, 7000, 9000, 3000);
		
		long count = salaryList.stream().filter(s-> s>=5000).count();
		System.out.println("Total Employee with salary greater than or equal to 5000:"+ count);

	}

}
