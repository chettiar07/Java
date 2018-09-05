
public class StackLinked {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	Node head;
	
	public void push(int num) {
		Node input= new Node(num);
		if(head==null) {
			head=input;
		}
		else {
			input.next=head;
			head=input;
		}
	}
	
	public int pop() {
		if(head==null) {
			System.out.println("There are no elements in the stack");
			return -1;
		}
		else {
			int b=head.data;
			head=head.next;
		
			return b;
		}
	}
	
	public int peak() {
		if(head==null) {
			System.out.println("There are no elements in the stack");
			return -1;
		}
		else {
			int b=head.data;
		
			return b;
		}
	}

	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		
		StackLinked obj = new StackLinked();
//		obj.push(1);
//		obj.push(2);
//		obj.push(3);
//		obj.push(4);
//		obj.push(5);
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.head.data);
//		System.out.println("The deleted element in the stack is "+obj.pop());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(" ");
		System.out.println("The peak element in the stack is "+obj.peak());
		

	}

}
