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
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a[i][j] = 0;
			}
		}
		a[4][4] = m;
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i < 8;i++)
			{
				for (j = 1;j < 8;j++)
				{
					b[i][j] = a[i - 1][j] + a[i + 1][j] + a[i][j - 1] + a[i][j + 1] + a[i + 1][j + 1] + a[i - 1][j + 1] + a[i + 1][j - 1] + a[i - 1][j - 1] + 2 * a[i][j];
				}
			}
			b[0][0] = a[1][1];
			b[8][8] = a[7][7];
			b[0][8] = a[1][7];
			b[8][0] = a[7][1];
			for (i = 1;i < 8;i++)
			{
				b[i][0] = a[i][1] + a[i - 1][1] + a[i + 1][1];
				b[i][8] = a[i][7] + a[i - 1][7] + a[i + 1][7];
			}
			for (j = 1;j < 8;j++)
			{
				b[0][j] = a[1][j] + a[1][j - 1] + a[1][j + 1];
				b[8][j] = a[7][j] + a[7][j - 1] + a[7][j + 1];
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] = b[i][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
				System.out.print(b[i][j]);
				System.out.print(' ');
			}
			System.out.print(b[i][8]);
			System.out.print("\n");
		}
		return 0;
	}

}

