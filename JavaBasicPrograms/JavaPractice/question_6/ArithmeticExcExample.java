


public class ArithmeticExcExample{  
	  public static void main(String args[]){  
	   try{  
	      int marks = 25/0;  
	   }catch(ArithmeticException e)
	   {
		   System.out.println(e);
	   }  	
	   
	   System.out.println("rest of the code...");  
	  }  
	}  