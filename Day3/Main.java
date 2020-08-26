class UserMainCode
{
	static Boolean validateCity(String city)
	{
		if(city.equals(format("%c%c**%c%c")))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("invalid");
		}
	}

	private static Object format(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}


public class Main1{
	public static void main(String args[])
	{
		validateCity("ch**ai");
	}


}
