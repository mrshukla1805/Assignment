
public class StringClassExample {
	public static void main(String[] args) {
		String s = "Parth Shukla";
		//charAt function
		System.out.println(s.charAt(3));
		//length function
		System.out.println(s.length());
		//substring 
		System.out.println(s.substring(4));
		System.out.println(s.substring(4,7));
		//contains method returns true or false
		System.out.println(s.contains("Shukla"));
		//isEmpty
		System.out.println(s.isEmpty());
		//LowerCase
		System.out.println(s.toLowerCase());
		//Uppercase
		System.out.println(s.toUpperCase());
		//Remove ending and beginning spaces of a string using trim
		System.out.println(s.trim());
		
		
	}
}
