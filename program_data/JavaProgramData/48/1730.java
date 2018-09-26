package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[10][11][11];
		int m;
		int n;
		int j = 0;
		int k = 0;
		int i = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][5][5] = m;
		for (j = 1;j < n + 1;j++)
		{
			for (k = 1;k < 10;k++)
			{
				for (i = 1;i < 10;i++)
				{
					a[j][k][i] = a[j - 1][k - 1][i - 1] + a[j - 1][k - 1][i] + a[j - 1][k - 1][i + 1] + a[j - 1][k][i - 1] + a[j - 1][k][i + 1] + a[j - 1][k + 1][i - 1] + a[j - 1][k + 1][i] + a[j - 1][k + 1][i + 1] + 2 * a[j - 1][k][i];
				}
			}
		}
		for (j = 1;j < 10;j++)
		{
			for (k = 1;k < 10;k++)
			{
				if (k == 9)
				{
					System.out.print(a[n][j][k]);
					System.out.print('\n');
				}
				else
				{
					System.out.print(a[n][j][k]);
					System.out.print(' ');
				}
			}
		}
		return 0;
	}

}

