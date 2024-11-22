package oopsPolymorphism;

public class MethodOrderRidding {

public static void main(String[] args) 
	
	{
	System.out.println("****Acers start***");
		Acer a=new Acer();
		a.display();
		a.processor();
		a.storage();
		System.out.println("****Acers end***");
		System.out.println("_______");
		System.out.println("****HP start***");
		HewlettPackard hp=new HewlettPackard();
		hp.display();
		hp.processor();
		hp.storage();
		System.out.println("****HP End***");
		System.out.println("_______");
		System.out.println("****Dell Start***");
		Dell d = new Dell();
		d.display();
		d.processor();
		d.storage();
		System.out.println("****Dell End***");
	}
}
