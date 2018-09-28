package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int[][] a = new int[23][23];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= n + 1; i++)
		{
			a[0][i] = 0;
			a[m + 1][i] = 0;
		}
		for (i = 0; i <= m; i++)
		{
			a[i][0] = 0;
			a[i][n + 1] = 0;
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (a[i - 1][j] <= a[i][j] != 0 && a[i][j - 1] <= a[i][j] != 0 && a[i + 1][j] <= a[i][j] != 0 && a[i][j + 1] <= a[i][j])
				{
					System.out.printf("%d %d\n",i - 1,j - 1);
				}
			}
		}
		return 0;
	}
}

