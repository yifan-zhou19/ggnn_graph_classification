package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[m + 1][n + 1];
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int k;



		for (k = 1;k <= n;k++)
		{
			for (i = k;(i >= 1) && (k + 1 - i <= m);i--)
			{
				System.out.print(a[k + 1 - i][i]);
				System.out.print("\n");
			}
		}



		for (k = 2;k <= m;k++)
		{
			for (i = n;(i >= 1) && (k + n - i <= m);i--)
			{
				System.out.print(a[k + n - i][i]);
				System.out.print("\n");
			}
		}
	return 0;

	}
}

