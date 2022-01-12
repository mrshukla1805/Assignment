


public class MemoryOutEg {
	public static void main(String[] args) {
		try {
			int[] arr = new int[100*100*100*100*100];
		}
		catch (OutOfMemoryError ex) { 
			System.out.println("OutOfMemoryError");
		}
		
	}
}

