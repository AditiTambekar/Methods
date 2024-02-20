package Methods;

import java.io.PrintStream;

public class ReverseNumber {
	int reverse(int n) {
		int r;
		int rev=0;
		while(n>0) {
			r=n%10;
			rev=rev*10+r;
			n=n/10;	
		}return rev;


	}

	public static void main(String[] args) {
		
		ReverseNumber r=new ReverseNumber();
		System.out.println(r.reverse(347));
	}

}
