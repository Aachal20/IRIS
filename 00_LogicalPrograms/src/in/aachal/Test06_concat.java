package in.aachal;

public class Test06_concat {

	public static void main(String[] args) {
		String s1 = "Aachal";
		String s2 = s1.concat("Mozare");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		System.out.println();
		
		String s3 = "a";
		s3.concat("b");
		System.out.println("s3 :"+s3);
		System.out.println();
		
		String s4 = s3.concat("c");
		System.out.println("s3 :"+s3);
		System.out.println("s4 :"+s4);
		System.out.println(s3==s4);
		System.out.println();
		
		
		
		//String str1 = null + null;  //we can add 2 numbers, 2 chars and 2 strings or 1 string + any type
		//String str2 = null.concat(null);
		
		String str3 = null + "a";
		System.out.println(str3);
		
		String str4 = "a" + null;
		System.out.println(str4);
		
		//String str5 = null.concat("a");
		//String str6 = "a".concat(null);
		
		String s23 = null;
		String s24 = null;
		String s25 = s23 + s24;
		System.out.println(s25);
		
		//String s26 = s23.concat(s24);
		System.out.println();
		
		String s27 = 7 + 8 + "hari" + 8 + 7 + null+"A";
		//String s28 = null + 7 + 8 + "hari" + 8 + 7;
		System.out.println(s27);
		
		System.out.println("========AA=====");
		String s29 = "a";
		String s30 = "a";
		System.out.println("s29==s30::"+s29==s30);  //System.out.println("s29==s30"+"a"=="a");  System.out.println("s29==s30a"=="a");
		System.out.println("s29==s30 :: "+(s29==s30));
		System.out.println("========AA=====");
		//Which one give high performance
		//+ operator or concat()
		
		String s31 = "abc";
		String s32 = "bbc";
		String s33 = s31 + s32;
		String s34 = s31.concat(s32);
		System.out.println(s33);
		System.out.println(s34);
		
		String s35 = s31 + s32 + s31 + s32;
		String s36 = s31.concat(s32).concat(s31).concat(s32);
		System.out.println(s35);
		System.out.println(s36);
	}
}