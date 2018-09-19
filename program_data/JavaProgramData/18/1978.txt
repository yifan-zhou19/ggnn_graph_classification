package <missing>;

public class GlobalMembers
{
	public static void suo(int[][] b, int n)
	{
		int row = 0;
		int l = 0;
		for (int i = 1;i < n - 1;i++)
		{
			for (int j = 0;j < n;j++)
			{
				b[i][j] = b[i + 1][j];
			}
		}
		for (int j = 1;j < n - 1;j++)
		{
			for (int i = 0;i < n;i++)
			{
				b[i][j] = b[i][j + 1];
			}
		}
	return;
	}

	public static int square(int[][] a, int n)
	{
		if (n == 1)
		{
			return 0;
		}
		for (int i = 0;i < n;i++)
		{
			int min = a[i][0];
			for (int j = 1;j < n;j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];
				}
			}
			for (int j = 0;j < n;j++)
			{
				a[i][j] -= min;
			}
		}
		for (int i = 0;i < n;i++)
		{
			int min = a[0][i];
			for (int j = 1;j < n;j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];
				}
			}
			for (int j = 0;j < n;j++)
			{
				a[j][i] -= min;
			}
		}
		int t = a[1][1];
		int sum = 0;
		suo(a, n);
		sum = t + square(a, n - 1);
		return sum;
	}
	public static int Main()
	{
		int i;
		int n;
		int k;
		int j;
		int[][] m = new int[101][101];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				for (k = 0;k < n;k++)
				{
					m[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(square(m, n));
			System.out.print("\n");
		}
	return 0;
	}
}

