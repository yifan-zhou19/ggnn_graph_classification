package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int common = new int(int x,int y);
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(common(m, n));
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
		if (x < y)
		{
			return common(x, y / 2);
		}
	}

}

