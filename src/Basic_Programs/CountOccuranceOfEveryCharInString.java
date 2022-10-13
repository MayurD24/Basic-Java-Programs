package Basic_Programs;

import java.util.Scanner;

public class CountOccuranceOfEveryCharInString {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = scn.nextLine();

		int b[] = new int[256];  // Total ASCII values in string are 256
		
		for(int i=0; i<a.length(); i++) {
			
			b[a.charAt(i)]++;   //count frequency of every character
		}

		for(int i=0; i<256; i++) {
			//printing characters which are present at least once
			if(b[i] != 0) {
				System.out.println((char) i + " : " + b[i] );
			}
		}
		scn.close();
	}

}
