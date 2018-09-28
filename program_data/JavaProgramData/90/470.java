package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		if (x == 0)
		{
			return 1;
		}
		else if ((x != 0) && (y == 0))
		{
			return 0;
		}
		else if ((x != 0) && (y != 0) && (x >= y))
		{
			return f(x - y, y) + f(x, y - 1);
		}
		else
		{
			return f(x, y - 1);
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(k, m));
			System.out.print("\n");
		}
		return 0;
	}

}

