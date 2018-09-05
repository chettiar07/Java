
public class FactorialUsingRecursion {
	public static void main(String[] args) {
		System.out.println("The Factorial is "+calFactorial(5));
		
	}
	public static double calFactorial(double n) {
		double res=1;
		if(n == 0) { 
			return res;
			}
		else if(n==1) {
			return res;
		}
		else {
			res=n*calFactorial(n-1);
			}
		return res;
	}

}
