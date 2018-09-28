package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int q;
		int m;
		int n;
		int[][] a = new int[100][100];
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= m + n - 2;i++)
		{
			for (j = 0;i - j >= 0;j++)
			{
				if (j < m && i - j < n)
				{
				System.out.print(a[j][i - j]);
				System.out.print("\n");
				}
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

