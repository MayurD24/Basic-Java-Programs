package Basic_Programs;
import java.util.Scanner;

public class Vowels_In_String {

	public static void main(String[] args) {
	
		// to find count of vowels in string
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String a = scn.nextLine();
		
		a = a.toLowerCase();
		int count=0;
		
		for(int i =0; i<a.length(); i++) {
			
			if(a.charAt(i)=='a'|| a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o'|| a.charAt(i)=='u') {
				
				count++;
			}
		}
		System.out.println("count of Vowels in String is : "+count);
		scn.close();
	}

}
