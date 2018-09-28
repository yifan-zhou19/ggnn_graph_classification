package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3,5,7????   **
	//*????? 1300012845 **
	//*???2013.9.27  **
	//********************************
	public static int Main() //???
	{
		int n;
		int x;
		x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0) //?????3??
		{
			x = x + 3;
		}
		if (n % 5 == 0) //?????5??
		{
			x = x + 5;
		}
		if (n % 7 == 0) //?????7??
		{
			x = x + 7;
		}
		if (x == 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		if (x == 3)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		if (x == 5)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		if (x == 7)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		if (x == 8)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		if (x == 10)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		if (x == 12)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		if (x == 15)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		return 0;
	}

}

