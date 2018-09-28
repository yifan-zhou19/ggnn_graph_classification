package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int m;
		int k;
		int count = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[][][] a = new int[101][n + 2][n + 2];
		char p;
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
			p = ConsoleInput.readToWhiteSpace(true).charAt(0);
			switch (p)
			{
			case '.':
				a[1][i][j] = 1;
				break;
			case '#':
				a[1][i][j] = -200;
				break;
			case '@':
				a[1][i][j] = 2;
				break;
			}
		}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= m - 1;k++)
		{
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
			a[k + 1][i][j] = a[k][i][j];
		}
		}
		}
		for (k = 1;k <= m - 1;k++)
		{
			for (i = 1;i <= n;i++)
			{
			for (j = 1;j <= n;j++)
			{
				if (a[k][i][j] > 1)
				{
					a[k + 1][i - 1][j] = a[k][i - 1][j] + 1;
				 a[k + 1][i + 1][j] = a[k][i + 1][j] + 1;
				 a[k + 1][i][j - 1] = a[k][i][j - 1] + 1;
				 a[k + 1][i][j + 1] = a[k][i][j + 1] + 1;
				}

			}
			}
		}
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= n;j++)
		{
			if (a[m][i][j] > 1)
			{
				count++;
			}
		}
		}
		System.out.print(count);
		return 0;
	}
}

