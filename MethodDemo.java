package Methods;
import java.util.*;

public class MethodDemo {
	static int max(int x,int y) {
		if(x>y) {
			return x;	
		}else {
			return y;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=max(a,b);

		System.out.println(c);

	}

}
