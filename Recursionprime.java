public class Recursionprime {
	static int i=2;
	static int flag=0;

	public static void main(String[] args) {
		CheckPrimeNumber(7);

	}
	public static void checkflag(int n) {
		if(flag==n-2) {
			System.out.println("This is a prime number");
			return;
		}
	}
	public static void CheckPrimeNumber(int n) {
		if(i<n) {	
			if(n%i==0) {
				flag=1;
				System.out.println("This is not a prime number");
				return;
			}
			if(n%i!=0) {
				flag++;
			}
			i++;
			checkflag(n);
			CheckPrimeNumber(n);
			
		}	
		
			
	}		
		
}

