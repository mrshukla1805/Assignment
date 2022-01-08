
public class JavaThreadEg1 extends Thread {
	public void run() {
		System.out.println("Thread is Running");
	}
	
	public static void main(String args[]) {
		JavaThreadEg1 th1 = new JavaThreadEg1();
		th1.start();
	}
}
