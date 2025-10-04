package inheritance;

class Upi
{
	 void add()
	{
		System.out.println("add");
	}
	
}
class Atm extends Upi
{
	 void substract()
	{
		System.out.println("substract");
	}
	
}

public class Cash extends Atm {
	static void mul()
	{
		System.out.println("mul");
	}

	public static void main(String[] args) {
		Cash c1 = new Cash();
		c1.add();
		c1.substract();
		mul();
	

	}

}

