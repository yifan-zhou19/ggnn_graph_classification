package <missing>;

public class GlobalMembers
{
	public static int sum(int[][] a, int m, int n)
	{
		int x = 0;
		int i;
		for (i = 0;i < n;i++)
		{
			x = x + a[0][i] + a[m - 1][i];
		}
		for (i = 1;i < m - 1;i++)
		{
			x = x + a[i][0] + a[i][n - 1];
		}
		return x;
	}
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			int[][] a = new int[100][100];
			int m;
			int n;
			int j;
			int k;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			System.out.print(sum(a, m, n));
			System.out.print("\n");
		}
		return 0;
	}
}

