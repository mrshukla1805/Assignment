


public class JavaThreadEx2 implements Runnable {
	public void run() {
		System.out.print("Thread is Running");
	}
	
	public static void main(String args[]) {
		JavaThreadEx2 j = new JavaThreadEx2();
		Thread th1 = new Thread(j);
		th1.start();
	}
}
