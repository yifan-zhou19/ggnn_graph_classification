package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		int i = 0;
		int j = 0;
		int t = 1;
		for (t = 1; t <= k; t++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int sum = 0;
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				if (m == 1 && n == 1)
				{
					System.out.print(a[0][0]);
					System.out.print("\n");
				}
				else
				{
					for (i = 0; i < m; i++)
					{
						sum += a[i][0] + a[i][n - 1];

					}
					for (j = 0; j < n; j++)
					{
						sum += a[0][j] + a[m - 1][j];
					}
					sum = sum - a[0][0] - a[0][n - 1] - a[m - 1][0] - a[m - 1][n - 1];
					System.out.print(sum);
					System.out.print("\n");
				}
		}

		return 0;
	}



}

