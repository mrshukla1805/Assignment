
class Bike{
	private int km;
	private String brand;
	public int getKm() {
		return km;
	}
	public void setKm(int km) {
		this.km = km;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
	// NO argument constructor
	Bike(){
		System.out.println("No argument constructor called");
	}
	
	// Parameterized Constructor
	Bike(int km, String brand){
		System.out.println("Parameterized constructor called");
		this.setBrand(brand);
		this.setKm(km);
		
	}
	
}


public class ConstructorsExample {
	 public static void main(String args[]){  
		    //creating objects and passing values  
		    Bike s1 = new Bike(111,"KTM");  
		    Bike s2 = new Bike();  
		    System.out.println(s1.getBrand() + s1.getKm());
	 }
}
