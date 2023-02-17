package in.iris;


import java.util.Scanner;

public class CounteNoWordInString_03{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string to count a word::");

		String s=sc.nextLine();
		System.out.println(s);
		char[] ch=s.toCharArray();
		for(int i =0;i<=ch.length;i++) {
			//remove the spacce,special chr 
		}
		int length = s.length();
		System.out.println("Total characher :: "+length);
		System.out.println("Total characher :: "+ch.length);
	}
}
