
class Armstrong {
	static double result = 0;
	
	public void giveresult(double n) {
		if(checkArmstrong(n)==n) {
			System.out.println("This is an Armstrong Number");
		}
		else {
			System.out.println("This is not an Armstrong number");
		}
	}

	public static double checkArmstrong(double n) {
		if(n>0) {
			result =result+ Math.pow(n%10, 3);
			n=Math.floor(n/10);
			checkArmstrong(n);
			return result;
		}
		else {
			return result;
		}
	}

}

public class Arms{
	public static void main(String[] args) {
		Armstrong armsd= new Armstrong();
		armsd.giveresult(371);
	}
}

