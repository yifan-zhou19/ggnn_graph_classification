package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		char[][][] a = new char[100][101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[0][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		for (m = 0;m < 100;m++)
		{
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
						a[m][i][j] = a[0][i][j];
					}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < m;k++)
		{
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
						if (a[k][i][j] == '@')
						{
							if (a[k][i - 1][j] != '#')
							{
								a[k + 1][i - 1][j] = '@';
							}
														if (a[k][i][j - 1] != '#')
														{
															a[k + 1][i][j - 1] = '@';
														}
														if (a[k][i + 1][j] != '#')
														{
															a[k + 1][i + 1][j] = '@';
														}
														if (a[k][i][j + 1] != '#')
														{
															a[k + 1][i][j + 1] = '@';
														}
						}
					}
			}
		}
		int q = 0;
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
				if (a[m - 1][i][j] == '@')
				{
					q++;
				}
				}
		}
		System.out.print(q);
		return 0;
	}
}

