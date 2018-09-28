package <missing>;

public class GlobalMembers
{
	//******************************
	//*?????3?5?7???? **
	//*????? 1300012990 **
	//*???2013.09.27 **
	//******************************
	public static int Main()
	{
		int x; //????

		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		if (x % 3 == 0)
		{
			System.out.print("3");
		}
		if (x % 5 == 0)
		{
			if (x % 3 == 0)
			{
				System.out.print(" ");

			}
			System.out.print("5");
		}
		if (x % 7 == 0)
		{
			if (x % 3 == 0 || x % 5 == 0)
			{
				System.out.print(" ");
			}
			System.out.print("7");
		}
		if (x % 3 != 0 && x % 5 != 0 && x % 7 != 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

