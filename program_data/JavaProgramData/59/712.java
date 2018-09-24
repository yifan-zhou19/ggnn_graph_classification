package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int num = 0;
		int day = 1;
		int[][] b = new int[101][101];
		char[][] a = new char[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (day != m)
		{
			for (i = 0; i < n ;i++)
			{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '@' && b[i][j] == 0)
					{
						if ((j - 1) >= 0 && a[i][j - 1] == '.')
						{
							a[i][j - 1] = '@';
							b[i][j - 1] = 1;
						}
						if ((j + 1) < n && a[i][j + 1] == '.')
						{
							a[i][j + 1] = '@';
							b[i][j + 1] = 1;
						}
						if ((i - 1) >= 0 && a[i - 1][j] == '.')
						{
							a[i - 1][j] = '@';
							b[i - 1][j] = 1;
						}
						if ((i + 1) < n && a[i + 1][j] == '.')
						{
							a[i + 1][j] = '@';
							b[i + 1][j] = 1;
						}
					}
				}
			}
			day++;
			for (i = 0; i < n ;i++)
			{
				for (j = 0; j < n; j++)
				{
					b[i][j] = 0;
				}
			}
		}
		for (i = 0; i < n ;i++)
		{
				for (j = 0; j < n; j++)
				{
					if (a[i][j] == '@')
					{
						num++;
					}
				}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;

	}
}

