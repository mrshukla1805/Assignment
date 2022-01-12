
abstract class Intern3{
	abstract void field();
}

public class AbstractionEg extends Intern3 {
	void field() {
		System.out.println("Backend Developer");
		
	}
	public static void main(String args[]) {
		AbstractionEg obj = new AbstractionEg();
		obj.field();
	}
}
