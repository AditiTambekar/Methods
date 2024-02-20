package Methods;

public class MaxNumUsingVeriableArg {
	static int max(int ...a) {
		if(a.length==0)return Integer.MIN_VALUE;
		int m=a[0];
		for(int i=1;i<a.length;i++) 
			if(a[i]>m)m=a[i];
			
		return m;
			
		
	}

	public static void main(String[] args) {
				System.out.println(max());
				System.out.println(max(10));
				System.out.println(max(10,20));
				System.out.println(max(10,20,30));

	}

}
