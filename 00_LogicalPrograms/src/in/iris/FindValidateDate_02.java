package in.iris;


import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class FindValidateDate_02 {

	
	public static void main(String[] args) {
		System.out.println("Enter a Date");
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		
		FindValidateDate_02.validate(date);
	}

	 static void validate(String date) {
	 
			   DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
			try {
				format.parse(date);
				System.out.println("The given date is Valid Date");
			}
			catch(Exception e) {
				e.printStackTrace();
			}


		
	}
}