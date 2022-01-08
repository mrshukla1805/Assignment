
import java.util.*;

class Intern5 {
	int no;
	String firstname;
	String lastname;
	
	public Intern5(int no,String fname,String lname) {
		this.no = no;
		this.firstname = fname;
		this.lastname = lname;
	}
	
	//@Overiding toString() method
	public String toString() {
		return no+" "+firstname+" "+lastname;
	}
	
}

class Sortbyno implements Comparator<Intern5> {
	public int compare(Intern5 a, Intern5 b) {
		return a.no-b.no;
	}
}


public class InterfaceExample {
	public static void main(String []args) {
		ArrayList<Intern5> ar = new ArrayList<Intern5>();
		
		ar.add(new Intern5(3, "Parth", "london"));
		ar.add(new Intern5(4, "Rishabh", "london"));
		ar.add(new Intern5(1, "Khushboo", "london"));
		ar.add(new Intern5(2, "Archana", "london"));
		
		Collections.sort(ar, new Sortbyno());
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
	}
}
