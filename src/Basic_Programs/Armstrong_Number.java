package Basic_Programs;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String [] args){
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number : ");
		
	    int num = scn.nextInt();  // 575
	    int rem, result = 0, temp = num;
	   // 371 = 3^3 + 7^3 +1^3;
	    
	    int digits = (int)Math.log10(num) + 1;
	    
	   while (temp != 0)
	   {
	        rem = temp % 10;
	        result += Math.pow(rem, digits);
	        temp /= 10;  
	   } 
	   if ( result == num ) {
	        System.out.println (num + " is an Armstrong number");
	   }
	   else{
	    	System.out.println (num + " is not an Armstrong number");
	   }
	   scn.close();
	}                           
}
