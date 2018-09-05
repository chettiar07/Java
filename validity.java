import java.util.Stack;

public class validity{
	char ch[]=new char[10];
	Stack<Character> s = new Stack<Character>();
	
	
	public boolean isvalid(String str){
		char ch[] = str.toCharArray();
		Stack<Character>s = new Stack<Character> ();
		for(int i=0;i<ch.length;i++) {

			if(ch[i]=='{' || ch[i] == '(' || ch[i]=='[' || ch[i]=='<') {
				s.push(ch[i]);
				System.out.print(s+" ");

			}
			
			
			if(ch[i] =='}' || ch[i]==']' || ch[i]==')' || ch[i]=='>') {
					if(!s.empty()) {
						if(s.peek()=='{' && ch[i]=='}') {
							s.pop();
							System.out.println(s);
						
						}		
						else if(s.peek()=='[' && ch[i]==']'){
							s.pop();
							System.out.println(s);
							
						}
						else if(s.peek()=='(' && ch[i]==')') {
							s.pop();
							System.out.println(s);
							
						}
						else if(s.peek()=='<' && ch[i]=='>') {
							s.pop();
							System.out.println(s);
							
						}
						else {
							return false;
						}		
					}
					else {
						return false;
					}
					
			}
	
		}
	return true;
	}
							
	
	
	public void printstack() {
		System.out.println("the stack s is "+s);
	}
	
	public static void main(String[] args) {
		validity obj = new validity();
		System.out.println(obj.isvalid("({(())}))"));
//		System.out.println(obj.s);
		
	}
}