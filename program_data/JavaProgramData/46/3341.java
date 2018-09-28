package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[105][105];
		int m;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < m; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int k = 0;
		for (int t = 0; t < m * n; k++)
		{
			for (int j1 = k; j1 < m - k; j1++)
			{
				System.out.print(a[k][j1]);
				System.out.print("\n");
				t++;
			}
			for (int i1 = k + 1; i1 < n - k; i1++)
			{
				System.out.print(a[i1][m - 1 - k]);
				System.out.print("\n");
				t++;
			}
			if ((k + 1 <= n - 1 - k) && (m - 2 - k >= k))
			{
				for (int j = m - 2 - k; j >= k; j--)
				{
					System.out.print(a[n - 1 - k][j]);
					System.out.print("\n");
					t++;
				}
				for (int i = n - 2 - k; i >= k + 1; i--)
				{
					System.out.print(a[i][k]);
					System.out.print("\n");
					t++;
				}
			}
		}
		return 0;
	}

}

