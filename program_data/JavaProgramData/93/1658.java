package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????   **
	//*????? 1200012845 **
	//*???2012.9.26  **
	//********************************
	public static int Main()
	{
		int x; //??x?????
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if ((x % 3 != 0) && (x % 5 != 0) && (x % 7 != 0)) //x??3,5,7?????
		{
			System.out.print("n");
			System.out.print("\n");
		}
		else if (x % 3 == 0) //x??3??
		{
			System.out.print("3");
		}
			if (x % 5 == 0) //x??5??
			{
				if (x % 3 == 0)
				{
					System.out.print(" 5");
				}
				else
				{
					System.out.print("5");
				}
			}
			if (x % 7 == 0) //x??5??
			{
				if ((x % 3 == 0) || (x % 5 == 0))
				{
					System.out.print(" 7");
				}
				else
				{
					System.out.print("7");
				}
			}
		System.out.print("\n");
		return 0;
	}
}

