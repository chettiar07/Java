
public class QueueLinked {
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
		}
	}
	Node front;
	Node end;
	
	public void addqueue(int num) {
		Node input=new Node(num);
		if(front==null) {
			front=input;
			end=input;
		}
		else {
			input.next=end;
			end=input;
		}
	}
	
	public int deletequeue() {
		if(end==null) {
			System.out.println("There are no elements in the queue");
			return -1;
		}
		else {
			if(front==end) {
				end=null;
				return front.data;
			}
			else {
				int b= front.data;
				Node temp=end;
				while(temp.next!=front) {
					temp=temp.next;
				}
				temp.next=null;
				front=temp;
				return b;
			}
		}
	}
	
	
	
	
	public void print() {
		Node temp=end;
		while(temp!=null) {
			System.out.print("--->"+temp.data);
			temp=temp.next;
		}
	}
	

	public static void main(String[] args) {
		QueueLinked obj = new QueueLinked();
		obj.addqueue(1);
		obj.addqueue(2);
		obj.addqueue(3);
		obj.addqueue(4);
		obj.addqueue(5);
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.end.data);
//		System.out.println(obj.front.data);
		
//		System.out.println(obj.front.data);
//		System.out.println(" ");
//		System.out.println(obj.front.next.data);
		obj.print();
		System.out.println(" ");
		System.out.println(obj.deletequeue());
		System.out.println(obj.deletequeue());
		System.out.println(obj.deletequeue());
		System.out.println(obj.deletequeue());
//		System.out.println(obj.front.data);
//		System.out.println(obj.end.data);
//		System.out.println(" ");
		System.out.println(obj.deletequeue());
		System.out.println(obj.deletequeue());
	
	}

}
