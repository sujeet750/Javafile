package inheritance;

class Father
{
	 void add()
	{
		System.out.println("I got add");
	}
	 void substract()
	{
		System.out.println("I got substract");
	}
}
public class Child extends Father
	{
	    
		 void car()
		{
			System.out.println("I got car");
		}
	

	public static void main(String[] args) 
	{
		Child c = new Child();
		c.car();
		c.add();
		c.substract();
		

	}

}




