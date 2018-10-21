package <missing>;

public class GlobalMembers
{
	public static int F(int m,int n)
	{
		if (m == 0 || m == 1 || n == 1)
		{
			return 1;
		}
		if (m >= n)
		{
			return F(m, n - 1) + F(m - n, n);
		}
		return F(m, n - 1);
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(F(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

