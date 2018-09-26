package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[100][100];
		int[][] a = new int[100][100];
		int[] x = new int[10000];
		int[] y = new int[10000];
		int kx = 0;
		int ky = 0;
		int n;
		int m;
		int k = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (c[i][j] == '.')
				{
					a[i][j] = 1;
				}
				if (c[i][j] == '#')
				{
					a[i][j] = 0;
				}
				if (c[i][j] == '@')
				{
					a[i][j] = -1;
				}
			}
		}
		while (m > 1)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (a[i][j] == -1)
					{
						x[kx++] = i;
						y[ky++] = j;
					}
				}
			}
			for (int i = 0; i < kx; i++)
			{
				{
					if ((x[i] - 1 >= 0) && (a[x[i] - 1][y[i]] == 1))
					{
						a[x[i] - 1][y[i]] = -1;
					}
					if ((y[i] - 1 >= 0) && (a[x[i]][y[i] - 1] == 1))
					{
						a[x[i]][y[i] - 1] = -1;
					}
					if ((x[i] + 1 < n) && (a[x[i] + 1][y[i]] == 1))
					{
						a[x[i] + 1][y[i]] = -1;
					}
					if ((y[i] + 1 < n) && (a[x[i]][y[i] + 1] == 1))
					{
						a[x[i]][y[i] + 1] = -1;
					}
			}
			}
			kx = 0;
			ky = 0;

			m--;
		}
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (a[i][j] == -1)
				{
					k++;
				}
			}
		}
		System.out.print(k);
		System.out.print("\n");
		return 0;
	}

}

