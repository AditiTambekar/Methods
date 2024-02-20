package Methods;
import java.util.*;
public class Area {
	static float area(float l,float w) {
		return l*w;
	}
	static int area(int h,int b) {
		return 1/2*h*b;
	}
	static float area(float r) {
		return (float) (3.14*r*r);
	}
	static int area(int a) {
		
		return a*a;
	}

	public static void main(String[] args) {
//		int h=7,b=9;
		System.out.print(area(8.7f,4.3f));	}

}
