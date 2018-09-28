package <missing>;

public class GlobalMembers
{
	//******************************************
	//*??: ??(4-4) ??3?5?7????  **
	//*??: ??? 1300012991 **
	//*??: 2013?9?30? **
	//******************************************

	public static int Main()

	{
		int x;
		int a;
		int b;
		int c;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 105 == 0)
		{
			System.out.print("3 5 7");
		}
		else if (x % 15 == 0)
		{
			System.out.print("3 5");
		}
		else if (x % 35 == 0)
		{
			System.out.print("5 7");
		}
		else if (x % 21 == 0)
		{
			System.out.print("3 7");
		}
		else if (x % 3 == 0)
		{
			System.out.print("3");
		}
		else if (x % 5 == 0)
		{
			System.out.print("5");
		}
		else if (x % 7 == 0)
		{
			System.out.print("7");
		}
		else
		{
			System.out.print("n");
		}

	return 0;

	}















}

