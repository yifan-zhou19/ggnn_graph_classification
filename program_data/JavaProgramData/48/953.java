package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] b = new int[9][9];
	public static void copy(int[][] a, int[][] b)
	{
		for (int i = 0;i < 9;i++)
		{
			for (int j = 0;j < 9;j++)
			{
				a[i][j] = b[i][j];
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[4][4] = m;
		b[4][4] = m;
		for (int i = 0;i < n;i++)
		{
			for (j = 4 - i;j <= 4 + i;j++)
			{
				for (k = 4 - i;k <= 4 + i;k++)
				{
					for (int l = j - 1;l <= j + 1;l++)
					{
						for (int m = k - 1;m <= k + 1;m++)
						{
							b[l][m] += a[j][k];
						}
					}
				}
			}
			copy(a, b);
		}
		for (k = 0;k < 9;k++)
		{
			for (j = 0;j < 9;j++)
			{
				System.out.print(a[k][j]);
				if (j < 8)
				{
					System.out.print(' ');
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
			return 0;
	}
}

