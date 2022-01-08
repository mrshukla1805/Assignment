
import java.util.*;
public class MapExample {
	public static void main(String args[]) {
		Map<Integer, String> m = new HashMap<Integer,String>();
		  m.put(100,"Parth");  
		  m.put(101,"Rishabh");  
		  m.put(102,"Purohit");  
		  
		  for(Map.Entry<Integer,String> x: m.entrySet() ) {
			  System.out.println( x.getKey() +  x.getValue());
		  }
		  
		  
	}
}
