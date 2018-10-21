package <missing>;

public class GlobalMembers
{
	public static int an(int a,int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			return an(a, n - 1) * a;
		}
	}

	public static int func(int m,int n,int k)
	{
		if (n == 0)
		{
			return an(m - 1, m);
		}
		else
		{
			return m * func(m, n - 1, k) / (m - 1);
		}
	}

	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print((func(n, n, k) - (n - 1) * k));
		System.out.print("\n");
		return 0;
	}
}

