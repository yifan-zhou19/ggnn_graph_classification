package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int d;
		int num = 0;
		int x;
		int y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][n];
		 int[][] b = new int[n][n]; //b[][]??????????????????
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					num++;
					b[i][j] = 1; //???????????????1
				}
				else
				{
					b[i][j] = 0;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (d = 1;d <= m;d++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i][j] == '@' && b[i][j] >= 2) //?????????????????????????????
					{
							if (i > 0 && a[i - 1][j] == '.')
							{
								a[i - 1][j] = '@';
								num++;
								b[i - 1][j]++;
							}
							if (i < n - 1 && a[i + 1][j] == '.')
							{
								a[i + 1][j] = '@';
								num++;
								b[i + 1][j]++;
							}
							if (j < n - 1 && a[i][j + 1] == '.')
							{
								a[i][j + 1] = '@';
								num++;
								b[i][j + 1]++;
							}
							if (j > 0 && a[i][j - 1] == '.')
							{
								a[i][j - 1] = '@';
								num++;
								b[i][j - 1]++;
							}
					}
				}
			}
			for (x = 0;x < n;x++)
			{
				for (y = 0;y < n;y++)
				{
						if (b[x][y] != 0)
						{
					b[x][y]++; //?????????????????????1
						}

				}
			}
		}
	System.out.print(num);
	return 0;
	}
}

