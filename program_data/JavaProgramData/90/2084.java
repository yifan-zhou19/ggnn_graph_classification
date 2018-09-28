package <missing>;

public class GlobalMembers
{
	public static final int[][] mov =
	{
		{-1, 0},
		{0, -1},
		{1, 0},
		{0, 1}
	};

	public static int m;
	public static int n;
	public static int counter;

	public static void dfs(int m, int n, int i)
	{
		//cout << m << ' ' << n << endl;
		if (n == 0)
		{
			if (m == 0)
			{
				++counter;
			}
			return;
		}
		for (; i <= m - n + 1; ++i)
		{
			dfs(m - i, n - 1, i);
		}
	}

	public static int Main()
	{
		int t;
		int m;
		int n;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t-- != 0)
		{
			counter = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			dfs(m, n, 0);
			System.out.print(counter);
			System.out.print("\n");
		}
	}
}

