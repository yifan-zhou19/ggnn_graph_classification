package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int m;
		int n;
		int k;
		int i;
		int j;
		int s;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (s = 1; s <= k; s++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1; i <= m; i++)
			{
				for (j = 1; j <= n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (i = 1; i <= m; i++)
			{
				for (j = 1; j <= n; j++)
				{
					sum = sum + a[i][j];
				}
			}
			for (i = 2; i <= m - 1; i++)
			{
				for (j = 2; j <= n - 1; j++)
				{
					sum = sum - a[i][j];
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
	}
}

