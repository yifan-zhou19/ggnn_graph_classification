package <missing>;

public class GlobalMembers
{
	public static int dfs(int m,int dep)
	{
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (m == dep)
		{
			System.out.print(t);
			return 0;
		}
		dfs(m + 1, dep);
		System.out.print(' ');
		System.out.print(t);
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dfs(1, n);

		return 0;
	}


}

