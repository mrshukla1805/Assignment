import java.util.*;

public class DecisionExample {
	public static void main(String[] args) {
		//Take input and check if even or odd using if/else and switch
		
		//Taking input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//Using if/else
		if(n%2==0) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("ODD");
		}
		
		//Using switch statement
		switch(n%2) {
		case 0:
			System.out.println("EVEN");
			break;
		default:
			System.out.println("ODD");
			
		}
		
		sc.close();
		
		
	}
}
