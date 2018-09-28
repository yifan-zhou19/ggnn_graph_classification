package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int[][] x = new int[1000][1000];
	public static void f(int i, int j)
	{
		System.out.print(x[i][j]);
		System.out.print("\n");
		if (i == m && j == n)
		{
			return;
		}
		else if (j == 1 && i + 1 <= n)
		{
			f(1, i + 1);
		}
		else if (j == 1 && i + 1 > n)
		{
			f(i + j - n + 1, n);
		}
		else if (i == m && i + j <= n)
		{
			f(1, i + j);
		}
		else if (i == m && i + j > n)
		{
			f(i + j - n + 1, n);
		}
		else
		{
			f(i + 1, j - 1);
		}
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		f(1, 1);
		return 0;
	}
}

