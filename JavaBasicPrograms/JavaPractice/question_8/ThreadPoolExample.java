import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

 class Task implements Runnable {

 private String threadName ;
 
 public Task(String threadName) {  
  this.threadName =  threadName;  
 }
 
 public void run() {
  try {
   Thread.sleep(3000);
  } catch (InterruptedException e) {   
   e.printStackTrace();
  }
  System.out.println(Thread.currentThread().getName()+" "
    + Thread.currentThread().getId());
 }
 
 public String getName() {
  return threadName;
 }
 
 public void setName(String threadName) {
  this.threadName = threadName;
 } 
 
}

 public class ThreadPoolExample {
 
 public static void main(String args[]) {
  ExecutorService service = Executors.newFixedThreadPool(2);
  for (int i=1; i<=4 ; i++) {
   Task task = new Task("Task"+ i);
   System.out.println("Started: "+task.getName());
   service.execute(task);
  }
  service.shutdown();
 }
 
}