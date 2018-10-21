package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[150][150];
		char[][] b = new char[150][150];
		int n;
		int m;
		int count = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int q = 0 ; q <= 149; q++)
		{
			for (int w = 0; w <= 149; w++)
			{
				a[q][w] = '#';
				b[q][w] = a[q][w];
			}
		}
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 2; k <= m; k++)
		{
			for (int e = 1; e <= n; e++)
			{
				for (int r = 1; r <= n; r++)
				{
						 if (a[e][r] == '@')
						 {
							if (a[e][r + 1] == '.')
							{
								b[e][r + 1] = '@';
							}
							if (a[e][r - 1] == '.')
							{
								b[e][r - 1] = '@';
							}
							if (a[e + 1][r] == '.')
							{
								b[e + 1][r] = '@';
							}
							if (a[e - 1][r] == '.')
							{
								b[e - 1][r] = '@';
							}
						 }
				}
			}
			for (int z = 1; z <= n; z++)
			{
				for (int x = 1; x <= n; x++)
				{
					a[z][x] = b[z][x];
				}
			}
		}
		for (int t = 1; t <= n; t++)
		{
			for (int y = 1; y <= n; y++)
			{
				if (a[t][y] == '@')
				{
					count++;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}

}

