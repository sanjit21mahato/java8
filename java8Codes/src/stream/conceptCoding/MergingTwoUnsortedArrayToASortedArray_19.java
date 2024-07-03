package stream.conceptCoding;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergingTwoUnsortedArrayToASortedArray_19 {

	public static void main(String[] args) {
		int[] a = new int[] {4, 2, 7, 1};  
        int[] b = new int[] {8, 3, 9, 5};
       IntStream stream = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted();
       int arr[]=stream.toArray();  
       System.out.println(Arrays.toString(arr));

	}

}
