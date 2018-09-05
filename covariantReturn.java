
public class covariantReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new persons().habit();
		
	}

}

class persons{											//parent class
	persons habit() {
		System.out.println("habit of sleeping");
		return this;
	}
}

class employees extends persons{                        //child class
	employees habit() {
		System.out.println("habit of working");
		return this;
	}
	
	void worktime() {
		System.out.println("can work from 9-5");
	}
	
//	public static void main(String[] args) {
//		new employees();
//	}
}
