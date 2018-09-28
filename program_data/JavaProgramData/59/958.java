package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][][] a = new char[102][102][102];
		int i;
		int j;
		int s;
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[0][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (s = 1;s <= m + 1;s++)
		{
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
						a[s][i][j] = a[0][i][j];
					}
			}
		}
		for (s = 0;s < m;s++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[s][i][j] == '@')
					{
						a[s + 1][i][j] = '@';
					if (a[s][i + 1][j] == '.')
					{
						a[s + 1][i + 1][j] = '@';
					}
					if (a[s][i - 1][j] == '.')
					{
										a[s + 1][i - 1][j] = '@';
					}
					if (a[s][i][j + 1] == '.')
					{
														a[s + 1][i][j + 1] = '@';
					}
					if (a[s][i][j - 1] == '.')
					{
														a[s + 1][i][j - 1] = '@';
					}
					}
				}
			}

		}
		int count = 0;
		for (i = 0;i < n;i++)
		{
					for (j = 0;j < n;j++)
					{
						if (a[m - 1][i][j] == '@')
						{
							count++;
						}
					}
		}
		System.out.print(count);
		return 0;
	}

}

