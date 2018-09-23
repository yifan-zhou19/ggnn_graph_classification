package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[][][] a = new int[100][100][100];
	public static int Main()
	{
		int min;
		int[] sum = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int k = 0;k < n;k++)
	{
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				a[k][i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
	}
	for (int r = n;r > 1;r--)
	{
	for (int k = 0;k < n;k++)
	{
		for (int i = 0;i < r;i++)
		{
			min = a[k][i][0];
			for (int j = 1;j < r;j++)
			{
					if (a[k][i][j] < min)
					{
				min = a[k][i][j];
					}
			}
			for (int j = 0;j < r;j++)
			{
				a[k][i][j] = a[k][i][j] - min;
			}
		}
	}

	for (int k = 0;k < n;k++)
	{
		for (int j = 0;j < r;j++)
		{
			min = a[k][0][j];
			for (int i = 1;i < r;i++)
			{
					if (a[k][i][j] < min)
					{
				min = a[k][i][j];
					}
			}
			for (int i = 0;i < r;i++)
			{
				a[k][i][j] = a[k][i][j] - min;
			}
		}
	}

	for (int k = 0;k < n;k++)
	{
		sum[k] = sum[k] + a[k][1][1];
	for (int i = 1;i < r - 1;i++)
	{
		a[k][i][0] = a[k][i + 1][0];
	}
	for (int j = 1;j < r - 1;j++)
	{
		a[k][0][j] = a[k][0][j + 1];
	}
	for (int i = 1;i < r - 1;i++)
	{
		for (int j = 1;j < r - 1;j++)
		{
			a[k][i][j] = a[k][i + 1][j + 1];
		}
	}
	}
	}


	for (int k = 0;k < n;k++)
	{
	System.out.print(sum[k]);
	System.out.print("\n");
	}
	return 0;
	}
}

