package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] vis = new int[510];
	public static String s = new String(new char[510]);

	public static void dfs(int p,int q)
	{
		for (;vis[p] != 0;p++)
		{
			;
		}
		if (p >= n)
		{
			return;
		}
		if (s.charAt(p) != s.charAt(0))
		{
			System.out.print(q);
			System.out.print(' ');
			System.out.print(p);
			System.out.print("\n",vis[p] = vis[q] = 1);
		}
		else
		{
			for (;vis[p] == 0;)
			{
				dfs(p + 1, p);
			}
		}
	}

	public static int Main()
	{
		s = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = s.length();
		dfs(0, -1);
		return 0;
	}

}

