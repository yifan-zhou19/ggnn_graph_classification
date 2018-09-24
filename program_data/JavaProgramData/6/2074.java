package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int n;
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int l = 0; l < k; l++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 0; j < n; j++)
			{
				sum = sum + a[0][j] + a[m - 1][j];
				if (m - 1 == 0)
				{
					sum = sum - a[m - 1][j];
				}
			}
			for (i = 1; i < m - 1; i++)
			{
				sum = sum + a[i][0] + a[i][n - 1];
				if (n - 1 == 0)
				{
					sum = sum - a[i][n - 1];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
			sum = 0;
		}
		return 0;
	}
}

