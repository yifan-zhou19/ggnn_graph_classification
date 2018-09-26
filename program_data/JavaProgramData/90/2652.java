package <missing>;

public class GlobalMembers
{
	public static int dfs(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}
		int res = dfs(m, n - 1);
		if (m >= n)
		{
			res += dfs(m - n, n);
		}
		return res;
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
			System.out.print(dfs(m, n));
			System.out.print("\n");
		}
	}

}

