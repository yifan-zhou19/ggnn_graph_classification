package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char b;
		int[][] a = new int[101][101];
		int n;
		int i;
		int j;
		int d;
		int r;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				b = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (b == '.')
				{
					a[i][j] = 1;
				}
				if (b == '#')
				{
					a[i][j] = 0;
				}
				if (b == '@')
				{
					a[i][j] = 2;
				}
			}

		}
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (r = 2;r <= d;r++)
		{
			  for (i = 1;i <= n;i++)
			  {
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 3)
				{
					a[i][j] = 2;
				}
			}
			  }
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 2)
					{
						if (a[i + 1][j] == 1)
						{
							a[i + 1][j] = 3;
						}
						if (a[i - 1][j] == 1)
						{
							a[i - 1][j] = 3;
						}
						if (a[i][j - 1] == 1)
						{
							a[i][j - 1] = 3;
						}
						if (a[i][j + 1] == 1)
						{
							a[i][j + 1] = 3;
						}
					}
				}
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 2 || a[i][j] == 3)
				{
					m++;
				}
			}
		}
		System.out.print(m);
		return 0;
	}

}

