package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int u = 0;
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x % 3 == 0)
		{
			u = u + 1;
			System.out.print("3");
		}
		if (x % 5 == 0)
		{
			if (u != 0)
			{
				System.out.print(' ');
			}
			u = u + 1;
			System.out.print("5");
		}
		if (x % 7 == 0)
		{
			if (u != 0)
			{
				System.out.print(' ');
			}
			u = u + 1;
			System.out.print("7");
		}
		if (u == 0)
		{
			System.out.print("n");
		}
		return 0;
	}

}

