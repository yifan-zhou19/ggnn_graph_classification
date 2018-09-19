package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[100][100];
		int mini = INT_MAX;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int c = 1; c <= n; c++)
		{
			for (int i = 0; i <= n - 1; i++)
			{
				for (int j = 0; j <= n - 1; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (int k = 1; k <= n - 1; k++)
			{
				for (int i = 0; i <= n - k; i++)
				{
					for (int j = 0; j <= n - k; j++)
					{
						mini = Math.min(mini, a[i][j]);
					}
					for (int l = 0; l <= n - k; l++)
					{
						a[i][l] -= mini;
					}
					mini = INT_MAX;
				}
				for (int i = 0; i <= n - k; i++)
				{
					for (int j = 0; j <= n - k; j++)
					{
						mini = Math.min(mini, a[j][i]);
					}
					for (int l = 0; l <= n - k; l++)
					{
						a[l][i] -= mini;
					}
					mini = INT_MAX;
				}
				sum += a[1][1];
				for (int i = 0; i <= n - k; i++)
				{
					for (int j = 1; j <= n - k - 1; j++)
					{
						a[i][j] = a[i][j + 1];
					}
				}
				for (int j = 0; j <= n - k - 1; j++)
				{
					for (int i = 1; i <= n - k - 1; i++)
					{
						a[i][j] = a[i + 1][j];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

