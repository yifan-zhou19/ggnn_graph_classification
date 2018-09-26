package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] c = new char[200][200];
		int[] x = new int[20000];
		int[] y = new int[20000];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 1;q < m;q++)
		{
			k = 0;
			for (int i = 0;i < n;i++)
			{
				for (int j = 0;j < n;j++)
				{
					if (c[i][j] == '@')
					{
						x[k] = i;
						y[k] = j;
						k++;
					}
				}
			}
			for (int i = 0;i < k;i++)
			{
				if (c[x[i] - 1][y[i]] == '.' && x[i] > 0)
				{
				c[x[i] - 1][y[i]] = '@';
				}
				if (c[x[i] + 1][y[i]] == '.' && x[i] < n - 1)
				{
				c[x[i] + 1][y[i]] = '@';
				}
				if (c[x[i]][y[i] - 1] == '.' && y[i] > 0)
				{
				c[x[i]][y[i] - 1] = '@';
				}
				if (c[x[i]][y[i] + 1] == '.' && y[i] < n - 1)
				{
				c[x[i]][y[i] + 1] = '@';
				}
			}

		}
		k = 0;
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (c[i][j] == '@')
				{
					k++;
				}
			}
		}
		System.out.print(k);
		System.out.print("\n");
	}

}

