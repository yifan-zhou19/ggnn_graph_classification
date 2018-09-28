package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		int i;
		int k = 0;
		if (n == 1 || m == 1 || n == 0)
		{
			return 1;
		}
		if (n >= m)
		{
			for (i = 1;i <= m;i++)
			{
				k += f(n - i, i);
			}
			return k;
		}
		if (n < m)
		{
			return f(n, n);
		}
	}

	public static int Main()
	{
		int k;
		int n;
		int i;
		int m;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(n, m));
		System.out.print("\n");
		}
		return 0;
	}
}

