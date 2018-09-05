
public class Stringclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="welcome";
		String s2="welcome";
		System.out.println(s);
		System.out.println(s2);
		System.out.println(s.substring(1));//creates a substring from index 1.
		System.out.println(s.substring(1,4));// creates a substring starting from 1 to 3 index.
		System.out.println(s.toUpperCase());// changes to upper case
		System.out.println(s.toLowerCase());// changes to lower case 
		
		String d=" arvind ";
		System.out.println(d);
		System.out.println(d.trim()); // eliminates the white spaces.
		System.out.println(s.startsWith("we"));
		System.out.println(s.endsWith("n"));
		System.out.println(d.charAt(1));
		int a =20;
		String w=String.valueOf(a);
		System.out.println(w+20);
		String h=s.replace("welcome","Welcome");
		System.out.println(h);

	}

}
