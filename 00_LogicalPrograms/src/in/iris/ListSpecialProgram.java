package in.iris;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListSpecialProgram {

	public static void main(String[] args) {

		Integer[] nn = {11,12,22,15,86,55,33,64};
		List<Integer> list = Arrays.asList(nn);
		//numberList.stream().filter(n -> n%2!=0).forEach(System.out::println);
		
		addElement(list);
	}

	 static void addElement(List<Integer> ll) {
			ListIterator<Integer> it = ll.listIterator();
			
			while (it.hasNext()) {
				int num = it.next();
				if(num%2==0) {
					it.add("AA");
				if (num ==10) {
					sum += num;
				}
			}
			return sum;
		}

	}
}
