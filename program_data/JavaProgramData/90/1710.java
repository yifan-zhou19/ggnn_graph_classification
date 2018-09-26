package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int fang = new int(int x, int y);
		int n;
		int i;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(fang(a, b));
			System.out.print("\n");
		}
		return 0;
	}
	public static int fang(int x, int y)
	{
		if (x == 0 || y == 0)
		{
			return 0;
		}
		if (x < y)
		{
			return fang(x, x);
		}
		if (x == y)
		{
			return fang(x, y - 1) + 1;
		}
		if (x > y)
		{
			return fang(x, y - 1) + fang(x - y, y);
		}
	}
}

