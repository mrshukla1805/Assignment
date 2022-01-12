
interface intern4{
	void skillset();
}




public class InterfacesEg implements intern4 {
	public void skillset()
	{
		System.out.println("Kubernetes");
	}
	public static void main(String args[]) {
		InterfacesEg obj = new InterfacesEg();
		obj.skillset();
	}
	
	
}
