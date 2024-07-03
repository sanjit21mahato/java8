package stream.conceptCoding;

import java.util.Arrays;

public class StreamPeek_8 {

	public static void main(String[] args) {
		 int arr[] = {11,2,21,30,4,14,5};
		 //peek just shows what values are going for another operation , its like seeing the log
		 Arrays.stream(arr).filter((e)->e>10).peek((i)->System.out.println(i)).map((x)->x*x).toArray();

	}

}
