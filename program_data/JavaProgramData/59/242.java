package <missing>;

public class GlobalMembers
{
	public static char[][] a = new char[102][102];
	public static int[][] flag = new int[102][102];

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int num = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= 101;i++)
		{
			for (j = 0;j <= 101;j++)
			{
				a[i][j] = '0';
				flag[i][j] = 1;
			}
		}

		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < m - 1; i++)
		{
			for (j = 1; j <= n; j++)
			{
				for (k = 1; k <= n; k++)
				{
					if (a[j][k] == '@' && flag[j][k] != 0)
					{
						if (a[j + 1][k] == '.')
						{
							a[j + 1][k] = '@';
							flag[j + 1][k] = 0;
						}
						if (a[j - 1][k] == '.')
						{
							a[j - 1][k] = '@';
							flag[j - 1][k] = 0;
						}
						if (a[j][k + 1] == '.')
						{
							a[j][k + 1] = '@';
							flag[j][k + 1] = 0;
						}
						if (a[j][k - 1] == '.')
						{
							a[j][k - 1] = '@';
							flag[j][k - 1] = 0;
						}
					}

				}
			}
			for (j = 1; j <= n; j++)
			{
				for (k = 1; k <= n; k++)
				{
					flag[j][k] = 1;
				}
			}
		}

		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
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

