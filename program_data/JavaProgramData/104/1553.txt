package <missing>;

public class GlobalMembers
{
	public static int x;
	public static int y;
	public static int maxn;
	public static int dfs(int n)
	{
		int r = 0;
		if (n == x || n == y)
		{
			r++;
		}
		if (n > maxn)
		{
			return 0;
		}
		r += dfs(2 * n) + dfs(2 * n + 1);
		if (r == 2)
		{
			System.out.print(n);
			System.exit(0);
		}
		return r;
	}
	public static int Main()
	{
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		maxn = x > y != 0?x:y;
		dfs(1);
		System.out.print(x);
	}
}

