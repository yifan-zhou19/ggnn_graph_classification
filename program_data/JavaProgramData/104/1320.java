package <missing>;

public class GlobalMembers
{
	public static int common(int x, int y)
	{
		if (x == y)
		{
		return x;
		}
		else
		{
			int p;
			if (x > y)
			{
			return common((int)x / 2, y);
			}
			else
			{
			return common(x, (int)y / 2);
			}
		}
	}
	public static int Main()
	{
		int x;
		int y;
		while ((x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			System.out.print(common(x, y));
		}
		return 0;
	}

}

