package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[101][101];
		int i;
		int j;
		int t;
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 1; t <= k; t++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 1 && n == 1)
			{
				a[1][1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				System.out.print(a[1][1]);
				System.out.print("\n");
			}
			else
			{
			for (i = 1; i <= m; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1; j <= n; j++)
			{
				sum += a[1][j] + a[m][j];
			}
			for (i = 1; i <= m; i++)
			{
				sum += a[i][1] + a[i][n];
			}
			sum = sum - a[1][1] - a[1][n] - a[m][1] - a[m][n];
			System.out.print(sum);
			System.out.print("\n");
			}
			int[][] a = new int[101][101];
			sum = 0;
		}
		return 0;
	}
}

