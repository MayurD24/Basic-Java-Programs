package Basic_Programs;

import java.util.Arrays;
import java.util.Collections;

public class Descending_Array {

	public static void main(String[] args) {
		
		Integer [] a = {20,5,89,1,7};
		System.out.println("Original array : " + Arrays.toString(a));
		
		// using for loop
		int temp;	
		for(int i=0; i<a.length; i++) {
					
			for(int j=i+1; j<a.length; j++) {
						
				if(a[i] < a[j]) {
							
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Descending array : " + Arrays.toString(a));
		
		// using Arrays.sort method
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println("Descending array : " + Arrays.toString(a));

	}

}
