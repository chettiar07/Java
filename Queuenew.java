
public class Queuenew {
	
	int array[]=new int[5];
	int front=0;
	int index=0;
	int end=0;
	
	public void initialization() {
		for(int i=0;i<array.length;i++) {
			array[i]=-1;
		}
	}
	
	public void addqueue(int num) {
//		if(index==0) {
//			front=0;
//			end=-1;
//		}
		if(index!=array.length) {
			if(end==array.length) {
				int b=(end)%array.length;
				end=b;
				array[end]=num;
				end++;
				index++;
//				if(end==front) {
//					end=end-1;
//				}
//				else {
//					end=end;
//				}
			}
			else {
				array[end]=num;
				end++;
				index++;
			}
		
		}
		else {
			front=0;
			end=0;
			System.out.println("The queue is full");
		}
	}
	
	public int deletequeue() {
//		if(index==0) {
//			end=-1;
//			front=0;
//			return -1;
//		}
		if(index!=0) {
			if(front==array.length) {
				int b=(front)%array.length;
				front=b;
				int c=array[front];
				array[front]=-1;
				front++;
				index--;
				return c;
			}
			else {
				int b=array[front];
				array[front]=-1;
				front++;
				index--;
//				System.out.println("hey");
				return b;
			}	
		}
		else {
			end=0;
			front=0;
			System.out.println("There are no elements in the queue");
			return -1;
		}
	}
	
	public void display() {
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		Queuenew obj = new Queuenew();
		obj.initialization();
//		obj.addqueue(1);
//		obj.addqueue(2);
//		obj.addqueue(3);
//		obj.addqueue(4);
//		obj.addqueue(5);
//		obj.deletequeue();
//		obj.deletequeue();
//		obj.addqueue(10);
//		obj.display();
//		System.out.println("index "+obj.index);
//		System.out.println("front "+obj.front);
//		System.out.println("end "+obj.end);
//		obj.addqueue(20);
//		obj.display();
//		System.out.println("index "+obj.index);
//		System.out.println("front "+obj.front);
//		System.out.println("end "+obj.end);
//		obj.deletequeue();	
//		obj.addqueue(30);
//		System.out.println(" ");
//		obj.display();
//		obj.deletequeue();
//		System.out.println(" ");
//		obj.display();
//		obj.deletequeue();
//		obj.display();
//		obj.deletequeue();
//		obj.display();
//		obj.addqueue(40);
//		System.out.println(" ");
//		obj.display();
//		obj.addqueue(40);
//		System.out.println(" ");
//		obj.display();
//		System.out.println(" ");
//		obj.display();
//		obj.addqueue(40);
//		System.out.println(" ");
//		obj.display();
//		obj.deletequeue();
//		obj.display();
//		obj.deletequeue();
//		obj.display();
//		
////		obj.addqueue(50);
////		obj.addqueue(60);
////		obj.addqueue(50);
//////		obj.deletequeue();
////		System.out.println("index "+obj.index);
////		System.out.println("front "+obj.front);
////		System.out.println("end "+obj.end);
////		obj.display();
		
		obj.addqueue(10);
		obj.addqueue(20);
		obj.addqueue(30);
		obj.addqueue(40);
		obj.addqueue(50);
		obj.display();
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		
		System.out.println("");
		obj.addqueue(60);
		obj.display();
		
		
		System.out.println("");
		obj.addqueue(70);
		obj.display();
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		
		System.out.println("");
		obj.addqueue(80);
		obj.display();
		
		System.out.println("");
		obj.addqueue(90);
		obj.display();
		
		System.out.println("");
		obj.addqueue(100);
		obj.display();
		
		System.out.println("");
		obj.addqueue(110);
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		System.out.println("");
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		System.out.println("");
		obj.addqueue(120);
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.addqueue(130);
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.addqueue(140);
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		
		obj.deletequeue();
		obj.display();
		System.out.println(obj.index);
		System.out.println(obj.front);
		System.out.println(obj.end);
		

	}
	

}
