
public class Palindrome {

	public static void main(String[] args) {
		checkPalindrome(99);
		

	}
	public static void checkPalindrome(int n) {
		int og=n;
		int res=0;
		if(n==0) {
			System.out.println("This is a palindrome number");
		}
		else {
			while(n>0) {
				res=res*10+(n%10);
				n=n/10;
			}
			if(res==og){
				System.out.println("This is a Palindrome number");
			}
			else {
				System.out.println("This is not a palindrome number");
			}
		}
	}

}
