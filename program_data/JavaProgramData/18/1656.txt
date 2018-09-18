package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[200][200];
	public static int sum = 0;
	public static void solve(int n)
	{
		if (n != 1)
		{
		for (int i = 0; i < n; i++)
		{
			int min = a[i][0];
			for (int j = 0; j < n; j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (int i = 0; i < n; i++)
		{
			int min = a[0][i];
			for (int j = 0; j < n; j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[j][i] -= min;
			}
		}
		sum += a[1][1];
		for (int i = 1; i < n - 1; i++)
		{
			a[i][0] = a[i + 1][0];
			a[0][i] = a[0][i + 1];
		}
		for (int i = 1; i < n - 1; i++)
		{
			for (int j = 1; j < n - 1; j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
		solve(n - 1);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				solve(n);
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;
		}
		return 0;
	}


}

