package in.iris;


import java.util.Scanner;

public class ReverseString_04{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");

		String s=sc.nextLine();
		//System.out.println(s);
		char[] ch=s.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
			sc.close();
		}
	}
}
