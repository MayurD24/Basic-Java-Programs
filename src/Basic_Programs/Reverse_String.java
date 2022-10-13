package Basic_Programs;

import java.util.Scanner;
public class Reverse_String {

	public static void main(String[] args) {
		
		// for Loop
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string to reverse : ");
		String a = scn.next();
		
		String rev = "";
		
		for(int i=a.length()-1; i>=0; i--) {
			
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);
		scn.close();
		
		// 2nd way
		StringBuffer b = new StringBuffer("sudip");
		
		System.out.println(b.reverse());
		
		// 3rd way	
		StringBuilder c = new StringBuilder("tushar");
		System.out.println(c.reverse());
	}
	

}
