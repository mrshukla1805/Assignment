
import java.util.*;

public class SetsEg {
	public static void main(String[] args)   
    {   
        // creating LinkedHashSet using the Set  
        Set<String> data = new LinkedHashSet<String>();   
    
        data.add("Intern1");   
        data.add("Intern2");   
        data.add("Intern3");   
        data.add("Intern1");   
    
        System.out.println(data);   
        
        //Sets have different functions like Union Intersection and Difference
        Set<String> data2 = new LinkedHashSet<String>();
        data2.add("Intern1");   
        data2.add("Intern2");
        
        //Finding union of two sets
        Set<String> u_data = new LinkedHashSet<String>(data2);
        u_data.addAll(data);
        System.out.println(u_data);
        
        //Find internsection of two sets
        Set<String> i_data = new LinkedHashSet<String>(data2);
        
        
    
        
    }   
}
