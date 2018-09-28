package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????3?5?7????   **
	//*?????? 1300012757 **
	//*???2013.9.25  **
	//********************************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 3 == 0 && n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		else if (n % 3 != 0 && n % 5 == 0 && n % 7 == 0)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		else if (n % 3 == 0 && n % 5 != 0 && n % 7 == 0)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		else if (n % 3 == 0 && n % 5 == 0 && n % 7 != 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		else if (n % 3 == 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		else if (n % 5 == 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		else if (n % 7 == 0)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		else
		{
			System.out.print('n');
			System.out.print("\n");
		}
		return 0;
	}

}

