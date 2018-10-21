package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 1;t <= k;t++)
		{
			int sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 0;i < m;i++)
			{
				sum = sum + a[i][0] + a[i][n - 1];
			}
			for (j = 0;j < n;j++)
			{
				sum = sum + a[0][j] + a[m - 1][j];
			}
			if (k == 1)
			{
				sum = sum - 3 * a[0][0];
			}
			else
			{
				sum = sum - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

