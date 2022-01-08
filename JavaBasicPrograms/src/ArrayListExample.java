
import java.util.*;

public class ArrayListExample {
	public static void main(String args[]) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=1;i<6;i++) {
			l.add(i*4);
		}
		
		//Iterating
		for(Integer x:l) {
			System.out.print(x);
		}
		//Iterating Using Iterator
		System.out.println(" ");
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next());
		}
		System.out.println(" ");
		//Printing length
		System.out.println(l.size());
		//Sorting it
		Collections.sort(l);
		
		
		
		
	}
}
