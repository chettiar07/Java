
public class Armstrong {

	public static void main(String[] args) {
		checkArmstrong(113);

	}
	public static void checkArmstrong(double n) {
		double og=n;
		double res=0;
		while(n>0) {
		res=res+Math.pow((n%10),(3));
		n= Math.floor(n/10);
		}
		if(res==og) {
			System.out.println("This is an Armstrong number");
		}
		else {
			System.out.println("This is not a Armstrong number");
		}
		
	}

}
