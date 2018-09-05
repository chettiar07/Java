

class Fibousingrecursionns {
	static  int i=2,a=0,b=1,number=0;
	
	public void givepalindrome(int n) {
		System.out.print(a);
		System.out.print(" "+b);
		calculateFibonacci2(n);
		
	}

	public static void calculateFibonacci2(int n){
		if(i<n){
			number = a+b;
			a=b;
			b=number;
			i++;
			System.out.print(" "+number);
			calculateFibonacci2(n);
		}
		
	}
}
public class Fibo{
	
	public static void main(String[] args) {
		Fibousingrecursionns arvind=new Fibousingrecursionns();
		arvind.givepalindrome(10);
		
		
	}
}
