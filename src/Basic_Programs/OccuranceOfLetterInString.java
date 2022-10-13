package Basic_Programs;

import java.util.Scanner;

public class OccuranceOfLetterInString {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = scn.nextLine();
		
		int count =0;
		
		for(int i=0; i<a.length(); i++) {
			
			if(a.charAt(i) == 'e') {
				count++;
			}
		}
		System.out.println(count);
		scn.close();
	}

}
