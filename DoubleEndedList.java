
public class DoubleEndedList {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
		
	}
	
	Node head;
	Node tail;
	
	void addHead(int num) {
		Node input = new Node(num);
		if(head==null) {
			head=input;
			tail=input;
		}
		else {
			input.next=head;
			head=input;
		}
		
	}
	
	void addTail(int num) {
		Node input = new Node(num);
		if(tail==null) {
			head=input;
			tail=input;
			
		}
		else {
			tail.next=input;
			tail=input;
	
		}
	}
	
	void deleteHead() {
		if(head==null) {
			System.out.println("There are no nodes in the list");
		}
		else {
			head=head.next;
		}
	}
	
	void deleteTail() {
		if(tail==null) {
			System.out.println("There are no nodes in the list");
		}
		else {
			if(head.next==null) {
				tail=null;
				head=null;
			}
			else {
				Node temp=head;
				Node tempo=temp;
				while(temp.next!=null) {
					tempo=temp;
					temp=temp.next;
				}
				tempo.next=null;
				tail=tempo;
			}
		}
	}
	
	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print("-->"+temp.data);
			temp=temp.next;
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		DoubleEndedList obj = new DoubleEndedList();
		obj.addHead(1);
		obj.addHead(2);
		obj.addHead(3);
		obj.addHead(4);
		obj.addTail(5);
		obj.addTail(6);
		obj.addTail(7);
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.deleteHead();
//		obj.display();
		obj.deleteTail();
		obj.deleteTail();
		obj.deleteTail();
		obj.deleteTail();
		obj.deleteTail();
		obj.deleteTail();
		obj.deleteTail();
		obj.deleteTail();
		System.out.println(" ");
		obj.display();
		
//		System.out.println(obj.head.data);
//		System.out.println(obj.tail.data);
//		obj.deleteTail();
//		System.out.println(obj.tail.data);
//		obj.deleteTail();
//		System.out.println(obj.tail.data);
//		obj.deleteTail();
//		System.out.println(obj.tail.data);
//		obj.deleteTail();
//		System.out.println(obj.tail.data);

//		obj.display();
		
		
	}

}
