package Methods;

public class MethodOverloading1 {
	static int max(int x,int y) {
		return x>y?x:y;
	}
	static float max(float a,float b) {
		return a>b?a:b;
	}
	static int max(int x,int y,int z) {
		if(x>y&& x>z) {
			return x;
		}else if(y>z) {
			return y;
		}else {
			return z;
		}
	}
	public static void main(String[] args) {
		
		int a=3,b=7,c=9;
		System.out.print(max(a,b,c));
	}

}
