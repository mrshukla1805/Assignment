
abstract class Intern3{
	abstract void field();
}

public class Abstraction extends Intern3 {
	void field() {
		System.out.println("Backend Developer");
		
	}
	public static void main(String args[]) {
		Abstraction obj = new Abstraction();
		obj.field();
	}
}
