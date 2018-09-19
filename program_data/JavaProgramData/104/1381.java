package <missing>;

public class GlobalMembers
{
	public static int step(int x1,int y1)
	{
		if (x1 == y1)
		{
			return x1;
		}
		if (x1 > y1)
		{
			if (x1 % 2 == 0)
			{
				return step(x1 / 2, y1);
			}
		else
		{
			return step((x1 - 1) / 2, y1);
		}
		}
		if (x1 < y1)
		{
			if (y1 % 2 == 0)
			{
				return step(x1, y1 / 2);
			}
		else
		{
			return step(x1, (y1 - 1) / 2);
		}
		}
	}
	public static int Main()
	{
		int x;
		int y;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(step(x, y));
		System.out.print("\n");
		return 0;
	}
}

