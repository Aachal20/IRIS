package in.aachal;

import java.util.List;

//public static String join(String delimiter, CharSequence... cs);
//public static String join(String delimiter, Iterable<? extends CharSequence> iterable);
public class Test07_join {

	public static void main(String[] args) {
		
		String s1 = String.join("-","a","b","c","d","e");
		System.out.println("s1 : "+s1);
		
		String s2 = String.join("", "a","b","c","d");
		System.out.println("s2 : "+s2);
		
		String s3 = String.join("-");
		System.out.println("s3 : "+s3);
		
		String s4 = String.join("-", "a");
		System.out.println("s4 : "+s4);
		
		String s5 = String.join("-", "a","b");
		System.out.println("s5 : "+s5);
		
		String s6 = String.join("-", "a", new StringBuilder("b"), new StringBuilder("c"));
		System.out.println("s6 : "+s6);
		
		String s7 = String.join("-", "a", null, "b");
		System.out.println("s7 : "+s7);
		System.out.println();
		
		String s8 = String.join("::", new String[] {"a","b","c"});
		System.out.println("s8 : "+s8);
		
		String s9 = String.join("::", new StringBuffer("m"), new StringBuffer("n"));
		System.out.println("s9 : "+s9);
		
		List<String> list = List.of("p","q","r");
		String s10 = String.join("/", list);
		System.out.println("s10 : "+s10);
	}
}