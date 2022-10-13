package Basic_Programs;

import java.util.Scanner;

public class Palindrome_Number {
	
	public static void main(String []args){

	// To find the number is palindrome or not?

	Scanner scn = new Scanner(System.in);
	
	System.out.println("Enter the number : ");
	int a = scn.nextInt();

	int temp = a;
	int reverse = 0;

	while(temp>0){

		int rem = temp%10;  //121
		reverse = reverse*10 + rem;
		temp /=10;
	} 
	if(reverse == a){

		System.out.println(a + " is a palindrome number");
	}
	else {
		System.out.println(a + " is not a palindrome number");
	}
scn.close();
}

}
