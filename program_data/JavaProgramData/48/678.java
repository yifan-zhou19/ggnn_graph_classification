package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[11][11];
		int[][] b = new int[11][11];
		int d;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				a[i][j] = b[i][j] = 0;
			}
		}
		a[5][5] = m;
		for (d = 1;d <= n;d++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					b[i][j] = 2 * a[i][j] + a[i - 1][j - 1] + a[i - 1][j] + a[i - 1][j + 1] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j - 1] + a[i + 1][j] + a[i + 1][j + 1];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				if (j == 9)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(a[i][j]);
					System.out.print(' ');
				}
			}
		}
		return 0;
	}
}

