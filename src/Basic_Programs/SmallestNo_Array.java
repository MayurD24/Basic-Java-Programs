package Basic_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNo_Array {

	public static void main(String[] args) {
		
		int a [] = {20,55,2,86,45};
		
		// to find Smallest number from array of int
		Arrays.sort(a);       // sorts in Ascending order
		
		System.out.println("Smallest Number is : " + a[0]);
		
		// 2nd way
		int min = Arrays.stream(a).min().getAsInt();
		System.out.println("Smallest number is : " + min);
		
		// 3rd way
		List<Integer> list = new ArrayList<>();
		
		for(int i =0; i<a.length; i++) {
			list.add(a[i]);
		}
		System.out.println("Smallest number is : " + Collections.min(list));
		

	}

}
