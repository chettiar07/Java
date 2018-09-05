
public class CircularLinkedList {
	
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	
	Node head;
	public void addHead(int num) {
		Node input = new Node(num);
		if(head==null) {
			head=input;
			input.next=head;
		}
		else {
			if(head.next==head) {
				head.next=input;
				input.next=head;
//				System.out.println("hey");
			}
			else {
//				Node temp=head;
				input.next=head.next;
				head.next=input;
			}
		}
				
//				while(temp.next!=head) {
//					temp=temp.next;
//				}
//				temp.next=head;	
//			}
//		}
		
	}
	
	public void deleteHead() {
		head=head.next;
		Node temp = head;
		while(temp.next.next!=head) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
	}
	
	public void addinbetween(int num, int target) {
		Node input = new Node(num);
		Node temp=head;
		while(temp.data!=target) {
			temp=temp.next;
		}
		input.next=temp.next;
		temp.next=input;
		
	}
	
	public void deleteinbetween(int target) {
		Node temp=head;
		while(temp.next.data!=target) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
	}
	
	public int lengthofcirc() {
		int i=1;
		if(head==null) {
			System.out.println("there are no nodes in the list");
		}
		else {
			Node temp=head;
			while(temp.next!=head) {
				temp=temp.next;
				i++;
			}
		}
		return i;
	}
	
	public void display() {
		System.out.print("--->"+head.data);
		Node temp=head.next;
		while(temp!=head) {
			System.out.print("--->"+temp.data);
			temp=temp.next;
			
		}
	}

	
	
	
	
	
	public static void main(String[] args) {
		CircularLinkedList obj = new CircularLinkedList();
		obj.addHead(1);
		obj.addHead(7);
		obj.addHead(6);
		obj.addHead(5);		
		obj.addHead(4);
		obj.addHead(2);
		obj.display();
		System.out.println(" ");
		obj.deleteHead();
//		System.out.println(" ");
		obj.display();
		System.out.println(" ");
		obj.addinbetween(3,2);
		System.out.println(" ");
		obj.display();
		obj.addinbetween(100, 3);
		System.out.println(" ");
		obj.display();
		System.out.println(" ");
		obj.deleteinbetween(100);
		System.out.println(" ");
		obj.display();
		System.out.println(" ");
		System.out.println(obj.lengthofcirc());
		System.out.println("");
		System.out.println(obj.head.data);
//		System.out.println(" ");
//		System.out.println(obj.head.next.next.next.next.data);
		

	}

}
