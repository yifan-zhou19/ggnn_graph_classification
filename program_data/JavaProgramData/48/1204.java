package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int d;
		int n;
		int[][][] a = new int[5][9][9];
		int j;
		int k;
		int p;
		int q;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0][4][4] = n;
		p = 4;
		q = 4;
		for (i = 1; i <= d; i++)
		{
				for (j = p; j <= q; j++)
				{
					for (k = p; k <= q; k++)
					{
						a[i][j][k] += a[i - 1][j][k];
					}
				}
				for (j = p; j <= q; j++)
				{
					for (k = p; k <= q; k++)
					{
								a[i][j][k] += a[i - 1][j][k];
								a[i][j + 1][k] += a[i - 1][j][k];
								a[i][j][k + 1] += a[i - 1][j][k];
								a[i][j - 1][k] += a[i - 1][j][k];
								a[i][j][k - 1] += a[i - 1][j][k];
								a[i][j + 1][k + 1] += a[i - 1][j][k];
								a[i][j + 1][k - 1] += a[i - 1][j][k];
								a[i][j - 1][k + 1] += a[i - 1][j][k];
								a[i][j - 1][k - 1] += a[i - 1][j][k];
					}
				}
					p--;
					q++;
		}
		for (j = 0; j < 9; j++)
		{
				for (k = 0; k < 8; k++)
				{
					System.out.print(a[d][j][k]);
					System.out.print(' ');
				}
				System.out.print(a[d][j][8]);
				System.out.print("\n");
		}
		return 0;
	}


}

