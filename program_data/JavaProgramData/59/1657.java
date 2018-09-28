package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int m = 0;
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[n][n];
		int[][] b = new int[n][n];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = 0;
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int k = 0;k < m - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if ((a[i][j] == '@') && (b[i][j] == 0))
					{
						if ((i - 1 >= 0) && (a[i - 1][j] == '.'))
						{
							a[i - 1][j] = '@';
							b[i - 1][j] = 1;
						}
						if ((i + 1 < n) && (a[i + 1][j] == '.'))
						{
							a[i + 1][j] = '@';
							b[i + 1][j] = 1;
						}
						if ((j - 1 >= 0) && (a[i][j - 1] == '.'))
						{
							a[i][j - 1] = '@';
							b[i][j - 1] = 1;
						}
						if ((j + 1 < n) && (a[i][j + 1] == '.'))
						{
							a[i][j + 1] = '@';
							b[i][j + 1] = 1;
						}
					}
				}
			}
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					b[i][j] = 0;
				}
			}
		}
		int s = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == '@')
				{
					s++;
				}
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}

}

