package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[101][101];

	public static int hanshu(int n)
	{
		int min;
		int sum = 0;
		int i;
		int j;
		if (n == 1)
		{
			return 0;
		}
		else
		{
		for (i = 1; i <= n; i++)
		{
			min = 10000;
			for (j = 1; j <= n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 1; j <= n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (j = 1; j <= n; j++)
		{
			min = 10000;
			for (i = 1; i <= n; i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (i = 1; i <= n; i++)
			{
				a[i][j] -= min;
			}
		}
		sum = a[2][2];
		for (i = 1; i <= n; i++)
		{
			for (j = 2; j < n; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 1; j < n; j++)
		{
			for (i = 2; i < n; i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
		return sum + hanshu(n - 1);
		}
	}

	public static int Main()
	{
		int i;
		int j;
		int k;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1; k <= n; k++)
		{
			for (i = 1; i <= n; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(hanshu(n));
			System.out.print("\n");
		}

		return 0;
	}

}

