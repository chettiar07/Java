class Palindrome2 {
	static int result=0;
	public  void checkPalindrome(int n) {
		
		if(checkresult(n)==n) {
			System.out.println(n+" is a palindrome number");
		}
		else {
			System.out.println(n+" is not a palindome number");
		}
	}
		
		
	public int checkresult(int n) {
		if(n>0) {
			
			result = (result*10)+(n%10);
			n=n/10;
			
			return checkresult(n);
			
		}
		else {
			return result;
			
		}
	}
}

public class Recursionpalindrome2{
	public static void main(String[] args) {
		Palindrome2 number=new Palindrome2();
		number.checkPalindrome(12321);
	}
}
