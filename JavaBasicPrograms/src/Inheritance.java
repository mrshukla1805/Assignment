

class Intern{
	int stipend = 30000;
}



public class Inheritance extends Intern {
	int join = 10000;
	public static void main(String[] args) {
		Inheritance i = new Inheritance();
		System.out.println(i.stipend);
		System.out.println(i.join);
	}
}
