
import java.util.Arrays;

public class list1 {
		
	public static void main(String[] args) {
			MakeArray(9);
			MakeArray(10);
			MakeArray(11);
			MakeArray(12);
			MakeArray(13);
			MakeArray(14);
		}
		
		public static void MakeArray(int n) {
			int i=0;
			int array[]= new int[5];
			array[i]=n;
			System.out.println(array);
			i++;
			if(i==4) {
				int[] ChangedArray = Arrays.copyOf(array, 10);
				ChangedArray[i+1]=n;
				System.out.println(ChangedArray);
			}
			
			
		}


	}

	

