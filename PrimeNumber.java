
public class PrimeNumber {

	public static void main(String[] args) {
		calPrime(1);

	}
	public static void calPrime(int n) {
		if(n==0 || n==1) {
			System.out.println("This is not a prime number");
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0){
					System.out.println("This is not a prime number");
					break;
				}
			}
		System.out.println("This is a prime number");
		}
	}

}
