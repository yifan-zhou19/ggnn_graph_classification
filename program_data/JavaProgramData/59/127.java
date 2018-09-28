package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[103][103];
		int[][] b = new int[103][103];
		char t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				t = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (t == '#')
				{
					a[i][j] = 0;
				}
				if (t == '.')
				{
					a[i][j] = 100;
				}
				if (t == '@')
				{
					a[i][j] = 1;
				}
			}
		}
		int m;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2;k <= m;k++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] <= 1)
					{
						b[i][j] = a[i][j];
					}
					if (a[i][j] == 100)
					{
						if (a[i - 1][j] == 1 || a[i + 1][j] == 1 || a[i][j - 1] == 1 || a[i][j + 1] == 1)
						{
							b[i][j] = 1;
						}
						else
						{
							b[i][j] = 100;
						}
					}
				}
			}
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = b[i][j];
				}
			}

		}
		int sum = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 1)
				{
					sum++;
				}
			}
		}
		System.out.print(sum);
		return 0;
	}
}

