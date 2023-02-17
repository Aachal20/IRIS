package in.iris;

import java.util.Scanner;

class FindYearIsLeapOrNotLeapYear_01{

	public static void main(String[] args){

		int y = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a Year:");
		y = sc.nextInt();

		if(y%100==0 && y%4==0 || y%100!=0 && y%4==0 )
			System.out.println("Leap Year");
		else
			System.out.println("Not a Leap Year");
	}
//2000   1989  
	
}