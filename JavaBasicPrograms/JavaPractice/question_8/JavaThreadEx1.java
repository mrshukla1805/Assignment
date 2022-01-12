
public class JavaThreadEx1 extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}
	
	public static void main(String args[]) {
		JavaThreadEx1 th1 = new JavaThreadEx1();
		th1.start();
	}
}
