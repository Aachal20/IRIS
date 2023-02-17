package in.iris;

import java.util.Scanner;

class SumOfDigits_01{
	
	public static void main(String[] args){
		
		int rem;
		int sum=0;
		String option;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("enter a number:");
			int num=sc.nextInt();

			while(num!=0){
				rem=num%10;
				sum=sum+rem;
				num=num/10;     
			}
			System.out.println("digits sum:"+sum);

			System.out.println("\n do u want to continue");
			option=sc.next();
		}while (option.equalsIgnoreCase("Y"));

		sc.close();
	}
}