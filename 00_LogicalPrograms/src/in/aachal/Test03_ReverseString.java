package in.aachal;

import java.util.Scanner;

public class Test03_ReverseString{


	public static void main(String[] args) {
		String str = "Hello Aachal , Welcome to our Company !!!!!!!";
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();
		System.out.println("Reversed String : " + str);

	}

}

