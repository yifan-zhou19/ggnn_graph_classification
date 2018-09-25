package <missing>;

public class GlobalMembers
{
	public static int f(int x, int y)
	{
		if (x == y)
		{
			return x;
		}
		if (x > y)
		{
			x = x / 2;
			return f(x, y);
		}
			if (x < y)
			{
				y = y / 2;
				return f(x, y);
			}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x, y));
	}

}

