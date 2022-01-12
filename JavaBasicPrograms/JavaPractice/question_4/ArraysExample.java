
public class ArraysExample {
	public static void main(String[] args) {
		// Declare Array
		int[] arr;
		arr = new int[5];
		for(int i=0;i<5;i++) {
			arr[i] = i*3+12;
		}
		
		//Printing elements
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
			
		//Multidimensional Array
		int[][] ar = { {1,2},{3,4} };
		for(int i=0 ; i<2;i++) {
			for(int j=0;j<2;j++) {
				ar[i][j]= i*2+j*2;
			}
		}
		
	}
}
