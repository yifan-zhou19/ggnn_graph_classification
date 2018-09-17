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

	public static void dfs(int m, int i)
	{
		//cout << m << ' ' << n << endl;
		if (m == 1)
		{
			++counter;
			return;
		}
		for (;i <= m; ++i)
		{
			if (m % i == 0)
			{
				dfs(m / i, i);
			}
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
			dfs(m, 2);
			System.out.print(counter);
			System.out.print("\n");
		}
	}
}

