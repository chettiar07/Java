
public class methodoverloading {

	public static void main(String[] args) {
		display();
		
		int b=display(1);
		System.out.println(b);
		
		int c= display(1.222);
		System.out.println(c);
	}
	
	public static void display() {
		System.out.println("I am in void display ");
		return;
	}
	
	public static int display(int num1) {
		return num1;
	}
	
	public static int display(double num1) {
		return (int)num1;
	}

}
