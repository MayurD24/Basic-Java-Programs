package Basic_Programs;

public class Diamond_Pattern {

	public static void main(String[] args) {
		
		// to print ismometric triangle
		for(int i=1; i<=5; i++) {
			
			for(int j=5-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		// to print reverse isometric triangle wth length-1
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--) {
				System.out.print("* ");
			}
			System.out.println();
		}

	
	}

}
