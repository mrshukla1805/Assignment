
public class loopsExample {
	public static void main(String[] args) {
		//Find sum of numbers from 1 to 10 using for loop, while loop,
		//do while loop.
		int s1=0,s2=0,s3=0;
		for(int i=1;i<=10;i++) {
			s1+=i;
		}
		System.out.println(s1);
		
		int i=1;
		while(i<=10) {
			s2+=i;
			i++;
		}
		System.out.println(s2);
		
		i=1;
		do {
			s3+=i;
			i++;
		}while(i<=10);
		
		System.out.println(s3);
		
		
	}
}
