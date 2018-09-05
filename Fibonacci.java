
public class Fibonacci {

	public static void main(String[] args) {
		calculateFibonacci(10);

	}
	public static void calculateFibonacci(int n) {
		int a=0;
		int b=1;
		int c=a+b;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(int i=1;i<=n-2;i++) {
			System.out.print(c+" ");
			a=b;
			b=c;
			c=a+b;
		}
	}

}
