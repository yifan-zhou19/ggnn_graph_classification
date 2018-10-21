package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n = 0;
		int i = 0;
		int j = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[500][500];
		for (i = 0; i <= m - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= m - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				if (i == 0 && j == 0)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == 0 && j != 0 && j != n - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == 0 && j == n - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i != 0 && i != m - 1 && j == 0)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i != 0 && i != m - 1 && j == n - 1)
				{
					if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j == 0)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j != 0 && j != n - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j == n - 1)
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else
				{
					if (a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
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

