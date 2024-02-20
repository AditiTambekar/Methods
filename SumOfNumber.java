package Methods;

public class SumOfNumber {
	static int sum(int ...a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}return sum;
	}

	public static void main(String[] args) {
		
		System.out.print(sum(20));
		System.out.print(sum(20,40));
		System.out.print(sum(20,40,60));
	}

}
