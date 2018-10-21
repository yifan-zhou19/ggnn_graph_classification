package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		int l;
		int[] sum = new int[100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1;l <= k;l++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= m;i++)
			{
				for (j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (j = 1;j <= n;j++)
			{
				sum[l] += a[1][j];
			}
			for (j = 1;j <= n;j++)
			{
				sum[l] += a[m][j];
			}
			for (i = 1;i <= m;i++)
			{
				sum[l] += a[i][1];
			}
			for (i = 1;i <= m;i++)
			{
				sum[l] += a[i][n];
			}
			sum[l] = sum[l] - a[1][1] - a[m][1] - a[1][n] - a[m][n];
			System.out.print(sum[l]);
			System.out.print("\n");
		}
			return 0;
	}
}

