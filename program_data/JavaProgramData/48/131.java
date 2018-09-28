package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[5][11][11];
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][5][5] = m;
		for (i = 0;i < n;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				for (k = 1;k <= 9;k++)
				{
					a[i + 1][j][k] = 2 * a[i][j][k] + a[i][j - 1][k - 1] + a[i][j - 1][k + 1] + a[i][j + 1][k] + a[i][j - 1][k] + a[i][j][k + 1] + a[i][j][k - 1] + a[i][j + 1][k + 1] + a[i][j + 1][k - 1];
				}
			}
		}
		for (j = 1;j <= 9;j++)
		{
			System.out.print(a[n][j][1]);
		for (k = 2;k <= 9;k++)
		{
			System.out.print(' ');
			System.out.print(a[n][j][k]);
		}
		System.out.print("\n");
		}
		return 0;
	}

}

