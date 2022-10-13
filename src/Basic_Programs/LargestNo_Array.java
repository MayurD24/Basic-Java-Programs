package Basic_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestNo_Array {

	public static void main(String[] args) {
		
		int a [] = {20,55,2,86,45};
		
		// to find Lagest number from array of int
		Arrays.sort(a);       // sorts in Ascending order
		int total = a.length;
		
		System.out.println("Largest Number is : " + a[total-1]);
		
		// 2nd way
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("Largest number is : " + max);
		
		// 3rd way
		List<Integer> list = new ArrayList<>();
		
		for(int i =0; i<a.length; i++) {
			list.add(a[i]);
		}
		System.out.println("Largest number is : " + Collections.max(list));
		
	}
}
