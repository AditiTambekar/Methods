package Methods;

public class FindMaxNumInArray {
	static void max(int a[]) {
		int a1[]= {2,5,8,4,1};
		for (int x:a1) {
			System.out.print(" "+x);
		}
		for(int i=a[0];i<=a.length;i++) {
			if(i>a[i]) {
				System.out.println("max is:"+i);
			}
		}
		}
	public static void main(String[] args) {
		
	
		int b;
		
		max(b);
		}

}
