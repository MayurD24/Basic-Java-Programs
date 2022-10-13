package Basic_Programs;

public class Remove_SpecialCharFrom_String {

	public static void main(String[] args) {
		
		String a = "%M@a#$y87u*r#";
		
		System.out.println("Actual String : " + a);
		
		a = a.replaceAll("[^a-zA-Z]", "");
		
		System.out.println("Printing words in string : "+a);

	}

}
