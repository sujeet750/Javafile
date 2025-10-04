
//if child class static and parent class non static , then call by creating an object of child class
//through ref var we call parent


package inheritance;
 class Timesnow
{
	static void music()
	{
		System.out.println("music");
		}
	void politics()
	{
		System.out.println("politics");
	}
	
}

public class Newspaper extends Timesnow {
	
	 void ownnews()
	{
		System.out.println("ownnews");
	}

	public static void main(String[] args) {
		Newspaper n1 = new Newspaper();
		n1.politics();
		n1.ownnews();
		music();
		

	}

}



