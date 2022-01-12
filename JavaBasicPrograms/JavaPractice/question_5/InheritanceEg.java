

class Intern{
	int stipend = 30000;
}

public class InheritanceEg extends Intern {
	int join = 10000;
	public static void main(String[] args) {
		InheritanceEg i = new InheritanceEg();
		System.out.println(i.stipend);
		System.out.println(i.join);
	}
}
