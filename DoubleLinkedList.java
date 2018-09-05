
public class DoubleLinkedList {
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.data=data;
		}
	}
	
	Node head;
	
	public void addHead(int num) {
		Node input = new Node (num);
		if(head==null) {
			head=input;
		}
		else {
			input.next=head;
			head.prev=input;
			head=input;
		}
	}
	
	public void deleteHead() {
		if(head==null) {
			System.out.println("There are no nodes in the list");
		}
		else {
			head=head.next;
			head.prev=null;
			//System.out.println("hey");
		}
	}
	
	public void addInBetween(int num,int target) {
		Node input=new Node(num);
		Node temp=head;
		while(temp.data!=target) {
			temp=temp.next;
		}
		input.next=temp.next;
		temp.next.prev=input;
		temp.next=input;
		input.prev=temp;
		
	}
	
	public void deleteInBetween(int target) {
		Node temp=head;
		while(temp.data!=target) {
			temp=temp.next;
		}
		temp.prev.next=temp.next;
		System.out.println(temp.next.prev.next.data);
		
		temp.next.prev=temp.prev;
		System.out.println(temp.next.prev.data);
	}
	
	
	public int length() {
		Node temp=head;
		int i=0;
		while(temp!=null) {
			temp=temp.next;
			i++;
		}
		return i;
	}
	
	public void display(){
		Node temp=head;
		while(temp!=null) {
			System.out.print("<--->"+temp.data);
			temp=temp.next;
		}
		
	}

	public static void main(String[] args) {
		DoubleLinkedList obj = new DoubleLinkedList();
		obj.addHead(1);
		obj.addHead(2);
		obj.addHead(3);
		obj.addHead(4);
		obj.addHead(5);
		obj.addHead(8);
		obj.addHead(10);
		//obj.deleteHead();
		//obj.addInBetween(6, 3);
		obj.deleteInBetween(2);
		obj.display();
		System.out.println(" ");
		//System.out.println(obj.length());
		//System.out.println(obj.head.data);
		
	}

}
