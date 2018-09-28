package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[25][25];
	public static void check(int i, int j)
	{
		if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
		{
			System.out.print(i - 1);
			System.out.print(" ");
			System.out.print(j - 1);
			System.out.print("\n");
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				check(i, j);
			}
		}
		return 0;
	}
}

