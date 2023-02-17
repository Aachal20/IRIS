package in.aachal;

public class Test05_StringProb_WhySBuffer {

	public static void main(String[] args) {
		
		String s1 = "Aachal";
		System.out.println("Before concat: "+s1);
		s1.concat(" MOZARE");
		System.out.println("After concat: "+s1);
		
		System.out.println();
		
		String s2 = "YES";
		System.out.println("s1: "+s1);
		System.out.println("s2: "+s2);
		System.out.println();
		
		s1 = s1.concat("Pune");
		System.out.println("s1: "+s1);
		System.out.println();
		
		//Problem: Performance issue
		//if we modify String object for 1M times
		//1M new String objects are created
		
		//Solution: StringBuffer
		StringBuffer sb1 = new StringBuffer("hari");
		System.out.println("sb1: "+sb1);
		sb1.append("Java");
		System.out.println("sb1: "+sb1);
	}
}
