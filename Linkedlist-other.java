
public class Linkedlist {
	class Node{
		int data;
		Node next;
		
		Node(int data){
		this.data=data;
		}
	}
	
	Node head;

	void add(int num) {
		Node input= new Node(num);
		if(head==null) {
			head=input;
		}
		else {
			input.next=head;
			head=input;
		}
	}
	
	void addinbetween(int num,int target) {
		Node input= new Node(num);
		Node temp=head;
		while(temp.data!=target) {
			temp=temp.next;
			
		}
		input.next=temp.next;
		temp.next=input;
		
	}
	
	int lengthlink() {
		if(head==null){
			int i=0;
			System.out.println("There are no nodes in the list");
			return i;
		}
		else{
			Node temp=head;
			int i=1;
			while(temp.next!=null) {
				temp=temp.next;
				i++;
			}
			return i;
		}
			
	}
	
	void delete(int target) {
		Node temp=head;
		Node tempo=temp;
		int i=1;
		if(target==1) {
			head=temp.next;
		}
		while(i!=target) {
			tempo=temp;
			temp=temp.next;
			i++;
		
		}
		tempo.next=temp.next;
				
	}
	
	int find(int target) {
		Node temp=head;
		int i=1;
		while(temp.data!=target) {
			temp=temp.next;
			i++;
			
		}
		return i;
	}

	void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"-->");
			temp=temp.next;
		}
		
	}



	public static void main(String[] args) {
		Linkedlist list = new Linkedlist ();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.addinbetween(4, 3);
		list.display();
		System.out.println("kk ");
		System.out.println("The no of nodes is "+list.lengthlink());
		list.delete(4);
		list.display();
		System.out.println("ll ");
		System.out.println("It is the "+list.find(8)+" Node");
		
		
		
		
	}
	
}
