package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[20][20];
		int[] x = new int[400];
		int[] y = new int[400];
		int t = 0;
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (i == 0 && j == n - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (i == m - 1 && j == 0)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						x[t] = i;
						 y[t] = j;
						t++;
					}
				}
				if (i == m - 1 && j == n - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (i == 0 && j > 0 && j < n - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (i == m - 1 && j > 0 && j < n - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (j == 0 && i > 0 && i < m - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (j == n - 1 && i > 0 && i < m - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
				if (j > 0 && j < n - 1 && i>0 && i < m - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
						x[t] = i;
						y[t] = j;
						t++;
					}
				}
			}
		}
		for (int i = 0;i < t;i++)
		{
			System.out.print(x[i]);
			System.out.print(' ');
			System.out.print(y[i]);
			System.out.print("\n");
		}
		return 0;
	}

}

