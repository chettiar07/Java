import java.util.*;
public class tokenizer {

	public static void main(String[] args) {
		StringTokenizer obj = new StringTokenizer("My name is ARvind");
		System.out.println(obj.nextToken());
		
		StringTokenizer obj1 = new StringTokenizer("My name is ARvind","a");
		System.out.println(obj1.nextToken());
		System.out.println(obj1.nextToken());
		StringTokenizer obj2= new StringTokenizer("Mybname is arvind","n",false);
		System.out.println(obj2.nextToken());
		System.out.println(obj2.nextToken());
//		System.out.println(obj2.nextToken());
		System.out.println(obj2.countTokens());
		System.out.println(obj2.hasMoreTokens());
//		System.out.println(obj2.nextToken());
	}

}