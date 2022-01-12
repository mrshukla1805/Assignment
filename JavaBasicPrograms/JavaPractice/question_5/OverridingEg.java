


class Intern2{
	void salary() {
		System.out.println("30000");
	}
}

public class OverridingEg extends Intern2 {
	void salary() {
		System.out.println("75000");
	}
	public static void main(String[] args) {
		
		OverridingEg obj = new OverridingEg();
		obj.salary();
		
	}
}
