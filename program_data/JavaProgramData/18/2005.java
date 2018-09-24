package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int n;
		int i;
		int j;
		int t;
		int min;
		int count = 0;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (m = 0;m < n;m++)
		{
			for (i = 1;i <= n;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			count = 0;
			for (t = n;t >= 2;t--)
			{
				for (i = 1;i <= t;i++)
				{
					min = a[i][1];
					for (j = 1;j <= t;j++)
					{
						min = (a[i][j] < min != 0?a[i][j]:min);
					}
					for (j = 1;j <= t;j++)
					{
						a[i][j] -= min;
					}
				}
				for (j = 1;j <= t;j++)
				{
					min = a[1][j];
					for (i = 1;i <= t;i++)
					{
						min = (a[i][j] < min != 0?a[i][j]:min);
					}
					for (i = 1;i <= t;i++)
					{
						a[i][j] -= min;
					}
				}
				count += a[2][2];
				for (i = 2;i <= t - 1;i++)
				{
					for (j = 1;j <= t;j++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
				for (j = 2;j <= t - 1;j++)
				{
					for (i = 1;i <= t - 1;i++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}

}

