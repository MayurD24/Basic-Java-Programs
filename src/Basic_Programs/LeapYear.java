package Basic_Programs;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// year devided 4 is leap year
		// century year is not leap year unless it is devided by 400.
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the year : ");
		
		int year = scn.nextInt();   //100,200,300,1900,2000
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			
			System.out.println(year+" is a Leap Year");
		}
		else {
			System.out.println(year+" is not a Leap Year");
		}
		scn.close();
	}

}
