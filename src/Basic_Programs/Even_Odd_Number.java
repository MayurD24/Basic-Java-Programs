package Basic_Programs;

import java.util.Scanner;

public class Even_Odd_Number {

	public static void main(String args[]){

	// to find the even or odd number

	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int a = scn.nextInt();
	
	int rem = a%2;

	if(rem==0){
		
		if(a==0){
	
		System.out.println("The number is neither even nor odd");
		}
		else{
	
		System.out.println("The number is even number");
		}
	}
	else{
	System.out.println("The number is odd number");
	}

scn.close();

}
}
