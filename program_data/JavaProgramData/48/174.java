package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] a = new int[9][9];
		int[][] b = new int[9][9];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				a[i][j] = 0;
			}
		}
		int ave;
		int k;
		int x;
		int y;
		a[4][4] = n;
		for (k = 0; k < m; k++)
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					b[i][j] = 0;
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					if (a[i][j] != 0)
					{
						int num = a[i][j];
						a[i][j] = 2 * num;
						ave = num;
						for (x = i - 1; x <= i + 1; x++)
						{
							for (y = j - 1; y <= j + 1; y++)
							{
								if (x == i && y == j)
								{
									continue;
								}
								b[x][y] = b[x][y] + ave;
							}
						}
					}
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					a[i][j] = a[i][j] + b[i][j];
				}
			}
		}
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 8; j++)
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

