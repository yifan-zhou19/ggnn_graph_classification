package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int q;
		int i;
		int j;
		int[][] a = new int[9][9];
		int m;
		int[][] c = new int[9][9];
		int k;
		int[][] b = new int[9][9];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				a[i][j] = 0;
				c[i][j] = 0;
			}
		}
		a[4][4] = n;
		for (k = 1;k <= m;k++)
		{
			for (i = 0;i <= 8;i++)
			{
			for (j = 0;j <= 8;j++)
			{
				b[i][j] = 0;
				if (a[i][j] != 0)
				{
					c[i][j] = 1;

				}
			}
			}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 8;j++)
			{
				if (a[i][j] != 0 && c[i][j] == 1)
				{
					b[i - 1][j] = b[i - 1][j] + a[i][j];
					b[i + 1][j] = b[i + 1][j] + a[i][j];
					b[i][j - 1] = b[i][j - 1] + a[i][j];
					b[i][j + 1] = b[i][j + 1] + a[i][j];
					b[i + 1][j + 1] = b[i + 1][j + 1] + a[i][j];
					b[i - 1][j - 1] = b[i - 1][j - 1] + a[i][j];
					b[i + 1][j - 1] = b[i + 1][j - 1] + a[i][j];
					b[i - 1][j + 1] = b[i - 1][j + 1] + a[i][j];
					b[i][j] = b[i][j] + 2 * a[i][j];
					a[i][j] = 0;
					c[i][j] = 0;
				}
			}
		}
			for (i = 0;i <= 8;i++)
			{
			for (j = 0;j <= 8;j++)
			{
				a[i][j] = a[i][j] + b[i][j];
			}
			}
		}
		for (i = 0;i <= 8;i++)
		{
			for (j = 0;j <= 7;j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

