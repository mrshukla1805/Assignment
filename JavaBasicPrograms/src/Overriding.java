


class Intern2{
	void salary() {
		System.out.println("30000");
	}
}

public class Overriding extends Intern2 {
	void salary() {
		System.out.println("75000");
	}
	public static void main(String[] args) {
		
		Overriding obj = new Overriding();
		obj.salary();
		
	}
}
