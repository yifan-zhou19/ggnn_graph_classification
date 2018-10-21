package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[9][9]; //a??????????b????????????????
		int[][] b = new int[9][9];
		int i;
		int j;
		int k;
		int m;
		int n;
		int l;
		int x;
		int y;
		int t;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		for (i = 0;i < n;i++)
		{
			for (y = 0;y <= 8;y++)
			{
				for (t = 0;t <= 8;t++)
				{
				b[y][t] = 0;
				}
			}
			for (j = 4 - i;j <= (4 + i);j++)
			{
				for (k = 4 - i;k <= (4 + i);k++)
				{
					b[j - 1][k - 1] = b[j - 1][k - 1] + a[j][k]; //??? ????????????????????
					b[j - 1][k] = b[j - 1][k] + a[j][k];
					b[j - 1][k + 1] = b[j - 1][k + 1] + a[j][k];
					b[j][k - 1] = b[j][k - 1] + a[j][k];
					b[j][k + 1] = b[j][k + 1] + a[j][k];
					b[j + 1][k - 1] = b[j + 1][k - 1] + a[j][k];
					b[j + 1][k] = b[j + 1][k] + a[j][k];
					b[j + 1][k + 1] = b[j + 1][k + 1] + a[j][k];
				}
			}
					for (l = 3 - i;l <= (5 + i);l++)
					{
						for (x = 3 - i;x <= (5 + i);x++)
						{
							a[l][x] = 2 * a[l][x] + b[l][x]; //????????
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
		return 0;
	}
}

