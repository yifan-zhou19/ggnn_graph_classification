package <missing>;

public class GlobalMembers
{
	public static int fun(int m, int n, int j)
	{
		int i;
		int s = 0;
		if (n == 1)
		{
			return m >= j;
		}
		for (i = j; i < m; i++)
		{
			s = s + fun(m - i, n - 1, i);
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int m;
		int s;
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n > m)
			{
				n = m;
			}
			s = fun(m, n, 0);
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

