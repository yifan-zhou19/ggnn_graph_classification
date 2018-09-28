package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		int k;
		if (m == 1)
		{
			return 1;
		}
		if (n == 1)
		{
			return 1;
		}
		else
		{
			if (m > n)
			{
				k = f(m, n - 1) + f(m - n, n);
			}
			if (m == n)
			{
				k = f(m, n - 1) + 1;
			}
			if (m < n)
			{
				k = f(m, m);
			}
			return k;
		}
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		int l;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < t;i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			l = f(m, n);
			System.out.print(l);
			System.out.print("\n");
		}
		return 0;
	}
}

