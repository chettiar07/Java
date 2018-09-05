
public class typepromotion {
	
	
	
	void sum(int a , long b) {
		System.out.println("a method is invoked");
	}
	
	void sum(int a, int b, int c) {
		System.out.println("b method is invoked");
	}

	public static void main(String[] args) {
		typepromotion obj= new typepromotion();
		obj.sum(11, 22);
		int a =130;
		byte b = (byte)a;
		System.out.println(b);

	}

}
