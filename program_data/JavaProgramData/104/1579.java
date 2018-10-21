package <missing>;

public class GlobalMembers
{
	public static int up(int x)
	{
		return x / 2;
	}

	public static int meet(int x, int y)
	{
		if (x == y)
		{
			return x;
		}

		int depthx = log2(x);
		int depthy = log2(y);
		if (depthx < depthy)
		{
			return meet(x, up(y));
		}
		else if (depthx > depthy)
		{
			return meet(up(x), y);
		}
		else
		{
			return meet(up(x), up(y));
		}
	}

	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(meet(x, y));
	}
}

