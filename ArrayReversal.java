
public class ArrayReversal {
	int i=0;int []arr= new int [5];
	
	
	public void array(int data) {
		
		arr[i]=data;
		i++;
		
		if(i>5) {
			System.out.println("you cannot add any element");
		}
		
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]);
		}
		System.out.println("");
		
	}
	
	public void reversearray() {
		for(int j=arr.length-1;j>-1;j--) {
			System.out.print(arr[j]);
		}
	}
	
	public static void main(String[] args) {
		ArrayReversal obj = new ArrayReversal();
		obj.array(1);
		obj.array(2);
		obj.array(3);
		obj.array(4);
		obj.array(5);
		//obj.array(6);
		System.out.println("");
		obj.reversearray();

	}

}
