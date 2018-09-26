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
		for (i = 1; i < n + 1; i++)
		{
			for (k = 1; k < 10; k++)
			{
				for (j = 1; j < 10; j++)
				{
					a[i][k][j] = a[i - 1][k][j] * 2 + a[i - 1][k - 1][j] + a[i - 1][k + 1][j] + a[i - 1][k][j + 1] + a[i - 1][k][j - 1] + a[i - 1][k + 1][j + 1] + a[i - 1][k + 1][j - 1] + a[i - 1][k - 1][j + 1] + a[i - 1][k - 1][j - 1];
				}
			}
		}
		for (i = 1; i < 10; i++)
		{
			System.out.print(a[n][i][1]);
			for (j = 2; j < 10; j++)
			{
				System.out.print(' ');
				System.out.print(a[n][i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

