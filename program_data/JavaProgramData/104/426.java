package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (x != y)
		{
		if (x > y)
		{
			x = x / 2;
		}
		else
		{
			y = y / 2;
		}
		}
		if (x == y)
		{
			System.out.print(x);
			System.out.print("\n");
		}
		return 0;
	}
}

