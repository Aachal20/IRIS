package in.iris;

import java.util.Arrays;
import java.util.List;

public class ListContainOddNumberOrNot_06 {

	public static void main(String[] args) {

		Integer[] nn = {11,12,22,15,86,55,33,64};
		List<Integer> numberList = Arrays.asList(nn);
		numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
	}
}
//without LE-filter
