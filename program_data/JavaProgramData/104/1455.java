package <missing>;

public class GlobalMembers
{
	public static int last(int k)
	{
		if (k % 2 == 0)
		{
			return (k / 2);
		}
		else
		{
			return ((k - 1) / 2);
		}
	}

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
				x = last(x);
			}
			else
			{
				y = last(y);

			}
		}
		System.out.print(x);
	}
}

