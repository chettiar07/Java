
public class Factorial {

	public static void main(String[] args) {
	System.out.println("The factorial is "+ calculateFactorial(5));
	}
	
	public static double calculateFactorial(double n) {
		double res=1;
		if(n==0) {
			System.out.println("The Factorial of 0 is 1");
		}
		else {
			while(n>=1) {
				res=res*n;
				n--;
			}
		}
		return res;
		
	}

}
