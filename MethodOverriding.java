
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog rocky = new dog();
		rocky.eat("hot");
		

	}

}

class animal{
	animal(){
		System.out.println("this is an animal");
	}
	void eat(String data) {
		System.out.println("animal eats "+data);
	}
}

class dog extends animal{
	dog(){
		System.out.println("this is a dog ");
	}
	
	@override
	void eat(String data) {
		System.out.println("dog eats bone");
//		return 0;
	}
	
}