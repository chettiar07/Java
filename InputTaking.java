import java.util.Scanner;

public class InputTaking {
	
	public int addsum(int num1, int num2) {
		int answer = num1+num2;
		
		return answer;
	}
	
	public void inputs() {
		Scanner obj = new Scanner(System.in);
		
		int num1, num2;
		System.out.println("Enter the first num :");
		num1=obj.nextInt();
		
		System.out.println("Enter the second num :");
		num2=obj.nextInt();
		
		System.out.println("The numbers chosen are "+num1+" and "+num2);
		int answer= addsum(num1, num2);
		System.out.println("The addition of two numbers is "+answer);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputTaking arvind = new InputTaking();
		arvind.inputs();

	}

}
