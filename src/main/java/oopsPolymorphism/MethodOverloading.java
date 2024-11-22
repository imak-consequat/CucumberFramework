package oopsPolymorphism;

public class MethodOverloading {

		
	public  void ArtistTalent(String Singer)
	{
		System.out.println("Only Singer : "+Singer);
	}
	
	public  void ArtistTalent(String Singer, String Musician)
	{
		System.out.println("Singer & Musician : "+Singer+" " +Musician);
	}
	
	public  void ArtistTalent(String Singer, String Musician, String Actor)
	{
		System.out.println("Singer & Musician & Actor : "+Singer+" " +Musician+" " +Actor);
	}
	
	public  void ArtistTalent(String Singer, String Musician, String Actor, String Director)
	{
		System.out.println("Singer , Musician, Actor & Director: "+Singer+" " +Musician+" " +Actor+" " +Director);
	}
	
	
	public static void main(String[] args) {
		
		MethodOverloading at=new MethodOverloading();
		at.ArtistTalent("Sid Sriram");
		at.ArtistTalent("Anirudh","Ravichander");
		at.ArtistTalent("Vijay","Antony","sir");
		at.ArtistTalent("ATman-", "S", "T", "R");
		
		
	}
}
