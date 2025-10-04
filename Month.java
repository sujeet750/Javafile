package inheritance;

class Years extends Days
{
	static void october()
	{
		System.out.println("This is october");
	}
	
}

class Days
{
	static void monday()
	{
		System.out.println("This is monday");
	}
	
}



class Week extends Days
{
	static void oneweek()
	{
		System.out.println("This is one Week");
	}
	
}

public class Month extends Week {
	static void firstmonth()
	{
		System.out.println("This is first month");
	}

	public static void main(String[] args) {
		monday();
		oneweek();
		firstmonth();
		
	}

}

