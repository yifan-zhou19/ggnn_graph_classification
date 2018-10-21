package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int l;
		a[4][4] = m;
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (a[j][k] != 0)
					{
						b[j][k - 1] = b[j][k - 1] + a[j][k];
						b[j][k + 1] = b[j][k + 1] + a[j][k];
						b[j - 1][k] = b[j - 1][k] + a[j][k];
						b[j + 1][k] = b[j + 1][k] + a[j][k];
						b[j - 1][k - 1] = b[j - 1][k - 1] + a[j][k];
						b[j + 1][k + 1] = b[j + 1][k + 1] + a[j][k];
						b[j + 1][k - 1] = b[j + 1][k - 1] + a[j][k];
						b[j - 1][k + 1] = b[j - 1][k + 1] + a[j][k];
					}
				}
			}
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					if (a[j][k] != 0)
					{
						a[j][k] = a[j][k] + a[j][k];
					}
				}
			}
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					a[j][k] = a[j][k] + b[j][k];
				}
			}
			for (j = 0;j < 9;j++)
			{
				for (k = 0;k < 9;k++)
				{
					b[j][k] = 0;
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			System.out.print(a[i][0]);
			for (j = 1;j < 9;j++)
			{
				System.out.print(' ');
				System.out.print(a[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

