
public class inheritance {

	public static void main(String[] args) {
		dog rocky = new dog();
		rocky.eat();
		rocky.sleep();
		rocky.bark();	
	}

}

class animal{
	void eat() {
		System.out.println("The animal can eat");
	}
	void sleep() {
		System.out.println("The animal can sleep");
	}
}

class dog extends animal{
	void bark() {
		System.out.println("The dog can bark");
	}
}
