package Methods;
import java.util.*;

public class CheckPrimeNumber {
	 static boolean isPrime(int n) {
			for(int i=2;i<n/2;i++) {
				if(n%i==0) {
					return false;
				}
			}return true;
			
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
		System.out.println(isPrime(a));
	}
				
//		
//
//	}
	

}
