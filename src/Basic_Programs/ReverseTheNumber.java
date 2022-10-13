package Basic_Programs;

public class ReverseTheNumber {

	public static void main(String[] args) {

		int a =2502;
		int temp =a;
		int reverse =0;

		while(temp>0){
			int rem = temp%10;
			reverse = reverse*10 + rem;
			temp /= 10;
		}

		System.out.println("reverse of number is : " + reverse);

	}

}
