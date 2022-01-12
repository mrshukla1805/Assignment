public class VolatileDemo {
  private static volatile boolean flag = false;
  public static void main(String[] args) {
    // Thread-1
    new Thread(new Runnable(){
      @Override
      public void run() {
        for (int i = 1; i <= 2000; i++){
          System.out.println("value - " + i);
        }
        // changing status flag
        flag = true;
        System.out.println("status flag changed " + flag );
      }			
    }).start();
    // Thread-2
    new Thread(new Runnable(){		
      @Override
      public void run() {
        int i = 1;
        while (!flag){
          i++;
        }
        System.out.println("Start other processing " + i);    
      }
    }).start();
  }
}