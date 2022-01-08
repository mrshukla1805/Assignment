
interface intern4{
	void skillset();
}




public class InterfacesExample implements intern4 {
	public void skillset()
	{
		System.out.println("Kubernetes");
	}
	public static void main(String args[]) {
		InterfacesExample obj = new InterfacesExample();
		obj.skillset();
	}
	
	
}
