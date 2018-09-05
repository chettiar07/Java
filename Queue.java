
public class Queue {
	int array[] = new int[10];
	int end=0;
	int front=0;
	
	public void initialise() {
		for(int i=0;i<array.length;i++) {
			array[i]=-1;
		}
	}
	
	public void addqueue(int num) {
		if(end<array.length) {
			array[end]=num;
			end++;
		}
		else {
			System.out.println("The queue is full");
		}
	}
	
	public int deletequeue() {
		if(end>0) {
			int b=array[front];
			array[front]=-1;
			for(int i=0;i<end;i++ ) {
				array[i]=array[i+1];
			}
			end--;
			return b;
		}
		else {
			System.out.println("There are no elements in the queue");
			return -1;
		}
		
	}
	
	public void display() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public int size() {
		if(end==0) {
			return 0;
		}
		else {
			int i=1;
			for(i=1;i<end;i++) {
			}
			return i;
		}
	}

	public static void main(String[] args) {
		Queue obj = new Queue();
		obj.initialise();
//		obj.addqueue(1);
//		obj.addqueue(2);
//		obj.addqueue(3);
//		obj.addqueue(4);
//		obj.addqueue(5);
//		obj.addqueue(6);
//		
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.end);
//		System.out.println(obj.front);
//		System.out.println(" ");
//		System.out.println(obj.deletequeue());
//		obj.display();
//		System.out.println(obj.front);
//		System.out.println(" ");
//		System.out.println(obj.deletequeue());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(obj.deletequeue());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(obj.deletequeue());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(obj.deletequeue());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(obj.deletequeue());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.deletequeue());
//		System.out.println(" ");
//		obj.display();
//		System.out.println(obj.deletequeue());
//		System.out.println(obj.deletequeue());
//		System.out.println(obj.deletequeue());
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.deletequeue());
//		obj.display();
//		System.out.println(" ");
//		System.out.println(obj.deletequeue());
//		obj.addqueue(1000);
//		obj.addqueue(2000);
//		System.out.println(" ");
		obj.display();
		System.out.println(" ");
		System.out.println(obj.size());
		
		
	}

}
