package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[110][110];
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int e = 1;e <= k;e++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 1;i <= m;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (m == 1 && n == 1)
			{
				System.out.print(a[1][1]);
				System.out.print("\n");
			}
			else
			{
				for (int i = 1;i <= n;i++)
				{
					sum = sum + a[1][i];
				}
				for (int i = 1;i <= m;i++)
				{
					sum = sum + a[i][1];
				}
				for (int i = 1;i <= n;i++)
				{
					sum = sum + a[m][i];
				}
				for (int i = 1;i <= m;i++)
				{
					sum = sum + a[i][n];
				}
				sum = sum - a[1][1] - a[1][n] - a[m][1] - a[m][n];
				System.out.print(sum);
				System.out.print("\n");
				sum = 0;
			}
		}
		return 0;
	}

}

