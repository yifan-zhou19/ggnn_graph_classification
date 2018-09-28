package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (a % 105 == 0)
		{
			System.out.print("3 5 7");
			System.out.print("\n");
		}
		if (a % 15 == 0 && a % 105 != 0)
		{
			System.out.print("3 5");
			System.out.print("\n");
		}
		if (a % 35 == 0 && a % 105 != 0)
		{
			System.out.print("5 7");
			System.out.print("\n");
		}
		if (a % 21 == 0 && a % 105 != 0)
		{
			System.out.print("3 7");
			System.out.print("\n");
		}
		if (a % 3 == 0 && a % 5 != 0 && a % 7 != 0)
		{
			System.out.print("3");
			System.out.print("\n");
		}
		if (a % 5 == 0 && a % 3 != 0 && a % 7 != 0)
		{
			System.out.print("5");
			System.out.print("\n");
		}
		if (a % 7 == 0 && a % 3 != 0 && a % 5 != 0)
		{
			System.out.print("7");
			System.out.print("\n");
		}
		if (a % 7 != 0 && a % 3 != 0 && a % 5 != 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}

		return 0;
	}

}

