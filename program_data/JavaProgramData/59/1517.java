package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int day;
		int i;
		int j;
		int k;
		char x;
		int[][] a = new int[105][105];
		int[][] b = new int[105][105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				x = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (x == '.')
				{
					a[i][j] = 0;
				}
				else if (x == '#')
				{
					a[i][j] = -111;
				}
				else if (x == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		k = 1;
		while (k < day)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] == 1)
					{
						b[i - 1][j]++;
						b[i + 1][j]++;
						b[i][j + 1]++;
						b[i][j - 1]++;
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if ((a[i][j] == 0) && (b[i][j] != 0))
					{
						a[i][j] = 1;
					}
				}
			}
			k++;
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 1)
				{
					k++;
				}
			}
		}
		System.out.print(k);
	}
}

