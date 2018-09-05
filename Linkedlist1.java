import java.util.Arrays;

public class Linkedlist1 {
	static int i=0;
	static int array[]=new int[5];
		
	public static void main(String[] args) {
			MakeArray(9);
			MakeArray(10);
			MakeArray(11);
			MakeArray(12);
			MakeArray(13);
			MakeArray(14);
		}
		
		public static void MakeArray(int n) {
			if(i<5) {
				array[i]=n;
				i++;
				System.out.println(Arrays.toString(array));
			}
			else {
				int ChangedArray[]=new int[10];
				for(int j=0; j<5; j++) {
					ChangedArray[j]=array[j];
				}
				ChangedArray[i]=n;
				System.out.println(Arrays.toString(ChangedArray));
			}
			
			
		}


	}

	

