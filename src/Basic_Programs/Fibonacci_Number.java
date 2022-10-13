package Basic_Programs;

import java.util.Scanner;

public class Fibonacci_Number {
	
	public static void main(String []args){

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of elements in Fibonacci series : ");
		int count = scn.nextInt();

		int n1 =0, n2 = 1, n3;
		System.out.print(n1 +" "+ n2);
		
		for(int i = 0; i < count; i++){

			n3 = n1 + n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}
		scn.close();
	}

}
