


public class JavaThreadEg2 implements Runnable {
	public void run() {
		System.out.print("Thread is Running");
	}
	
	public static void main(String args[]) {
		JavaThreadEg2 j = new JavaThreadEg2();
		Thread th1 = new Thread(j);
		th1.start();
	}
}
