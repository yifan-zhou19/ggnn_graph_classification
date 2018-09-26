package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[m][n];
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if ((i != 0) && (i != m - 1) && (j != 0) && (j != n - 1))
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i == 0) && (i != m - 1) && (j != 0) && (j != n - 1))
				{
					if ((a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i != 0) && (i == m - 1) && (j != 0) && (j != n - 1))
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j - 1]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i != 0) && (i != m - 1) && (j == 0) && (j != n - 1))
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i != 0) && (i != m - 1) && (j != 0) && (j == n - 1))
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i == 0) && (i != m - 1) && (j == 0) && (j != n - 1))
				{
					if ((a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i == 0) && (i != m - 1) && (j != 0) && (j == n - 1))
				{
					if ((a[i][j] >= a[i + 1][j]) && (a[i][j] >= a[i][j - 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i != 0) && (i == m - 1) && (j == 0) && (j != n - 1))
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j + 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if ((i != 0) && (i == m - 1) && (j != 0) && (j == n - 1))
				{
					if ((a[i][j] >= a[i - 1][j]) && (a[i][j] >= a[i][j - 1]))
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;

	}
}

