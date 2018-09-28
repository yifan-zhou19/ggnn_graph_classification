package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[22][22];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= m + 1; i++)
		{
			for (int j = 0; j <= n + 1; j++)
			{
				if (i == 0 || i == m + 1 || j == 0 || j == n + 1)
				{
					a[i][j] = 0;
				}
				else
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}
		for (int k = 1; k <= m; k++)
		{
			for (int l = 1; l <= n; l++)
			{
				if (a[k][l] >= a[k - 1][l] != 0 && a[k][l] >= a[k + 1][l] != 0 && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k][l - 1])
				{
					System.out.print(k - 1);
					System.out.print(' ');
					System.out.print(l - 1);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

