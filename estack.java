
public class estack {
	int stack[]= {-1,-1,-1,-1,-1,-1,-1,-1,-1,-1};
	int i=0;
	
	
	
	public void push(int data) {
		if(i<stack.length) {					
			stack[i]=data;
			i++;
			
		}
		else {
			System.out.println("The stack is full");
		}
		
	}
	
	public int pop() {
		if(i>0) {
			int b= stack[i-1];
			stack[i-1]=-1;
			i--;
			return b;
		}
		
		else {
			System.out.println("There are no elements in the stack");
			return -1;
			}
	}
	
	
	public int peak() {
		return stack[i-1];
	}
	
	public int size() {
		int res=0;
		for(int j=0;j<i;j++) {
			res++;
		}
		return res;
		
	}
	
	public void display() {
		for(int j=0;j<stack.length;j++) {
			System.out.print(stack[j]+" ");
		}
	}
	
	
	

	public static void main(String[] args) {
		estack obj = new estack();
		obj.push(1);
		obj.push(2);
		obj.push(3);
		obj.push(4);
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.push(8);
		obj.push(9);
		obj.push(10);
//		obj.push(11);
//		obj.push(12);
		obj.display();
		System.out.println(" ");
		System.out.println("The deleted element is "+obj.pop());
		System.out.println("The deleted element is "+obj.pop());
		System.out.println("The deleted element is "+obj.pop());
		System.out.println("The deleted element is "+obj.pop());
		System.out.println("The deleted element is "+obj.pop());
		System.out.println("The deleted element is "+obj.pop());
		obj.display();
//		System.out.println("The deleted element is "+obj.pop());
//		System.out.println("The deleted element is "+obj.pop());
//		System.out.println("The deleted element is "+obj.pop());
//		System.out.println("The deleted element is "+obj.pop());
//		System.out.println(" ");
//		System.out.println("The deleted element is "+obj.pop());
		
//		System.out.println(obj.index);
//		System.out.println(" ");
//		obj.display();
//		System.out.println(" ");
//		System.out.println("The deleted element is "+obj.pop());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.index);
//		System.out.println(" ");
//		System.out.println(obj.pop());
//		obj.display();
		System.out.println(" ");
		System.out.println("The size of the stack is "+obj.size());
		
		System.out.println(" ");
		System.out.println(obj.peak());
		obj.push(500);
		obj.display();
		

	}

}
