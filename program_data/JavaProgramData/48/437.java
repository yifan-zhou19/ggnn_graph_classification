package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		int n;
		int t = 0;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (t < n)
		{
			for (i = 1;i < 8;i++)
			{
				for (j = 1;j < 8;j++)
				{
					b[i - 1][j - 1] += a[i][j];
					b[i - 1][j] += a[i][j];
					b[i - 1][j + 1] += a[i][j];
					b[i][j - 1] += a[i][j];
					b[i][j + 1] += a[i][j];
					b[i + 1][j - 1] += a[i][j];
					b[i + 1][j] += a[i][j];
					b[i + 1][j + 1] += a[i][j];
					b[i][j] += a[i][j];
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a[i][j] += b[i][j];
					b[i][j] = 0;
				}
			}
			t++;
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 8;j++)
			{
					System.out.print(a[i][j]);
					System.out.print(' ');
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
		return 0;
	}
}

