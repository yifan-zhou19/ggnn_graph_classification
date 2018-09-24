package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int common = new int(int,int);
		int x = 0;
		int y = 0;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(common(x, y));
		System.out.print("\n");
		return 0;
	}
	public static int common(int x,int y)
	{
		if (x == y)
		{
			return x;
		}
		if (x > y)
		{
			return common(x / 2, y);
		}
		else
		{
			return common(x, y / 2);
		}
	}

}

