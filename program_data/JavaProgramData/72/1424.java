package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[100][100];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
		for (int j = 1;j <= n;j++)
		{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (int i = 0;i <= m + 1;i++)
		{
			a[i][0] = -1,a[i][n + 1] = -1;
		}
		for (int j = 1;j <= m;j++)
		{
			a[0][j] = -1,a[m + 1][j] = -1;
		}
		a[0][0] = -2;
		a[0][n + 1] = -2;
		a[m + 1][0] = -2;
		a[m + 1][n + 1] = -2;
		for (int i = 1;i <= m;i++)
		{
		for (int j = 1;j <= n;j++)
		{
				if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
					System.out.print(i - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
		}
		}

		return 0;
	}

}

