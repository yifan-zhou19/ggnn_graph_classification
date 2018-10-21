package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *???????????     *
	// *??????  1300013011   *
	// *???2013.12.5            *
	// * * * * * * * * * * * * * * *
	public static int s(int[][] a, int i, int j)
	{
		if ((i < 0) || (i >= 8) || (j < 0) || (j >= 8) || (a[i][j] == 0))
		{
			return 0;
		}
		else
		{
			return a[i][j] / 2;
		}
	}
	public static void chart(int n, int[][] a)
	{
		int i;
		int j;
		int k;
		int h;
		int w1;
		int w2;
		int l1;
		int l2;
		if (n == 0)
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (j == 0)
					{
						System.out.print(a[i][j]);
					}
					else
					{
						System.out.print(" ");
						System.out.print(a[i][j]);
					}
				}
				System.out.print("\n");
			}
		}
		else
		{
			int[][] b = new int[9][9];
			for (k = 0; k < 9; k++)
			{
				for (h = 0; h < 9; h++)
				{
					if (a[k][h] != 0)
					{
						a[h][k] *= 2;
					}
				}
			}

			for (k = 0; k < 9; k++)
			{
				for (h = 0; h < 9; h++)
				{
					b[k][h] = s(a, k - 1, h - 1) + s(a, k, h - 1) + s(a, k - 1, h) + s(a, k - 1, h + 1) + s(a, k + 1, h) + s(a, k, h + 1) + s(a, k + 1, h - 1) + s(a, k + 1, h + 1);
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					a[i][j] += b[i][j];
				}
			}
			chart(n - 1, a);
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[9][9];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		chart(n, a);
		return 0;
	}
}

