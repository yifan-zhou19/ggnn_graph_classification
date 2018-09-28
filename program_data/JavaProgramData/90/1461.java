package <missing>;

public class GlobalMembers
{
	public static int waye(int m, int n)
	{
		if (m == 0 || m == 1 || n == 1)
		{
			return 1;
		}
		if (m >= n)
		{
			return (waye(m - n, n) + waye(m, n - 1));
		}
		if (m < n)
		{
			return (waye(m, n - 1));
		}
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (; t > 0; t--)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(waye(m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

