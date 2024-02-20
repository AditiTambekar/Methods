package Methods;

public class Discount {
	static int discount(double ...p) {
		int sum=0;
		for(int i=0;i<p.length;i++) {
			sum=(int) (sum+p[i]);
			if(sum<500) {
				return 10;
			}else if(sum<1000){
				return 20;
			}else if(sum<2000) {
				return 30;
			}
		}return 2;
	}

	public static void main(String[] args) {
		System.out.print(discount(200,100,500,700));

	}

}
