package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[m + 2][n + 2];
		for (int i = 1;i <= m;i++)
		{
				for (int j = 1;j <= n;j++)
				{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		for (int i = 0;i < m + 2;i++)
		{
		a[i][0] = 0;
		a[i][n + 1] = 0;
		}
		for (int i = 0;i < n + 2;i++)
		{
				a[0][i] = 0;
				a[m + 1][i] = 0;
		}
		for (int i = 1;i <= m;i++)
		{
				for (int j = 1;j <= n;j++)
				{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
				System.out.print(i - 1);
				System.out.print(' ');
				System.out.print(j - 1);
				System.out.print("\n");
				}
				}
		}
	}

}

