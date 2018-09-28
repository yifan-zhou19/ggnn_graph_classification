package <missing>;

public class GlobalMembers
{
	public static int f(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}
		if (m < n)
		{
			return g(m, m);
		}
		return f(m, n - 1) + f(m - n, n);
	}
	public static int g(int m,int n)
	{
		if (m == 0)
		{
			return 1;
		}
		if (m == 1)
		{
			return 1;
		}
		return f(m, n - 1) + f(m - n, n);
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(m, n));
			System.out.print("\n");
		}
		return 0;
	}



}

