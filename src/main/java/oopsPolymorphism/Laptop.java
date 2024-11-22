package oopsPolymorphism;

public class Laptop {

	String displaySize ="1024*795";
	int size =14; String processor="i3";
	String storage="1TB";
	
	public void display()
	{
		System.out.println("Display size :"+displaySize);
		System.out.println("monitor size:"+size);
	}
	
	public void processor()
	{
		System.out.println("Processor is intel:"+processor);
	}
	
	public void storage()
	{
		System.out.println("Storage :"+storage);
	}
}
