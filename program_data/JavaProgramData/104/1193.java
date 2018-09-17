package <missing>;

public class GlobalMembers
{
	public static int function(int x, int y)
	{
		if (x == y)
		{
			return (x);
		}
		else if (x > y)
		{
			if (x % 2 == 0)
			{
				return (function(x / 2, y));
			}
			else
			{
				return (function((x - 1) / 2, y));
			}
		}
		else
		{
			if (y % 2 == 0)
			{
				return (function(x, y / 2));
			}
			else
			{
				return (function(x, (y - 1) / 2));
			}
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(function(x, y));
		System.out.print("\n");
	}
}

