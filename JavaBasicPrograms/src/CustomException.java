
import java.util.Scanner;
import java.util.InputMismatchException;

class check_marks extends Exception
{  
    check_marks(String error)
    {
	super(error);
    }
}

public class CustomException
{    
	public static void main(String arg[])
    { 
	try
       {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter marks: ");
            int marks=sc.nextInt();
            if(!(marks>=0 && marks<=100))
           {
                throw(new check_marks("The marks are invalid: "+marks));
           }		
            System.out.print("The given marks are : " + marks);
	}
	catch(InputMismatchException e)
        {
            System.out.println("------The input is invalid-----");
        }
	catch(check_marks e)
        {
            System.out.println("Error:"+e);
        }
    }
	
}