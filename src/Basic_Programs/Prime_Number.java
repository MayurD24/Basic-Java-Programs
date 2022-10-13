package Basic_Programs;

import java.util.Scanner;

public class Prime_Number {

public static void main(String[]args){

	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the range of numbers");
	int n1 = scn.nextInt();
	int n2 = scn.nextInt();

	for(int i = n1; i<=n2; i++){

		int count = 0;
		int temp = i;
		
		while(temp>0){
		
		int rem = i%temp;
			
			if(rem==0){

			count++;
			}
		temp--;
		}
		
		if(count==2){
		
		System.out.println(i + " is prime number"); 
		}
	}
	scn.close();
}
}
