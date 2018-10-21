package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int num;

	public static void dfs(int i,int j)
	{
		int x;

		if (i == 1)
		{
			num++;
			return;
		}
		for (x = j;x <= i;x++)
		{
			if (i % x == 0)
			{
			dfs(i / x, x);
			}
		}
	}

	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (m > 0)
		{
			num = 0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		dfs(n, 2);
			System.out.print(num);
			System.out.print("\n");
		m--;
		}
	}
}

