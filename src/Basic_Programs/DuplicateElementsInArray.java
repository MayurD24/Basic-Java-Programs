package Basic_Programs;

public class DuplicateElementsInArray {

	public static void main(String[] args) {

		int [] a = {1,2,4,2,1,5,6,8,7,8};
		
		System.out.println("Duplicate elements in array are : ");
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[i]==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}
}
