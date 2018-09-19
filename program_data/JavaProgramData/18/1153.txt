package <missing>;

public class GlobalMembers
{
	public static void zero(int[][] a, int n)
	{
		int i;
		int j;
		int min;
		for (i = 0; i < n; i++)
		{
			min = a[i][0];
			for (j = 1; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (j = 0; j < n; j++)
		{
			min = a[0][j];
			for (i = 1; i < n; i++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (i = 0; i < n; i++)
			{
				a[i][j] -= min;
			}
		}
	}
	public static void trans(int[][] a, int n)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			for (j = 1; j < n - 1; j++)
			{
				a[i][j] = a[i][j + 1];
			}
		}
		for (j = 0; j < n; j++)
		{
			for (i = 1; i < n - 1; i++)
			{
				a[i][j] = a[i + 1][j];
			}
		}
	}
	public static int Main()
	{
		int n;
		int k;
		int[][] a = new int[100][100];
		int i;
		int j;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			sum = 0;
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1; j <= n - 1; j++)
			{
				zero(a, k);
				sum += a[1][1];
				trans(a, k);
				k--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

