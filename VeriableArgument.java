package Methods;

public class VeriableArgument {
	static void show(int start ,String ...a) {
		for(int i=0;i<=a.length;i++) {
			System.out.println(start+","+a[i]);
			start++;
		}
	}

	public static void main(String[] args) {
		show(3,"aditi","vedika","pooja","rajesh");
		
	}

}
