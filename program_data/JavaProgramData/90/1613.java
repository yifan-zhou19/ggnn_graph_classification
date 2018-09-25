package <missing>;

public class GlobalMembers
{
	public static int way(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (m == n)
		{
			return way(m, n - 1) + 1;
		}
		else if (m < n)
		{
			return way(m, m);
		}
		else
		{
			return way(m, n - 1) + way(m - n, n);
		}
	}
	public static int Main()
	{
		int N;
		int m;
		int n;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(way(m, n));
				System.out.print("\n");
		}
	}
}

