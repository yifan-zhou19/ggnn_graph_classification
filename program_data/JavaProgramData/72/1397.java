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
		int[][] h = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i - 1 >= 0 && j - 1 >= 0 && i + 1 < m && j + 1 < n)
				{
					if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == 0 && j - 1 >= 0 && j + 1 < n)
				{
					if (h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i + 1][j])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j - 1 >= 0 && j + 1 < n)
				{
					if (h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i][j + 1] != 0 && h[i][j] >= h[i - 1][j])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (j == 0 && i - 1 >= 0 && i + 1 < m)
				{
					if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j + 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (j == n - 1 && i - 1 >= 0 && i + 1 < m)
				{
					if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j - 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == 0 && j == 0)
				{
					if (h[i][j] >= h[0][1] != 0 && h[i][j] >= h[1][0])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == 0 && j == n - 1)
				{
					if (h[i][j] >= h[0][n - 2] != 0 && h[i][j] >= h[1][n - 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j == 0)
				{
					if (h[i][j] >= h[m - 2][0] != 0 && h[i][j] >= h[m - 1][1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j == n - 1)
				{
					if (h[i][j] >= h[m - 2][n - 1] != 0 && h[i][j] >= h[m - 1][n - 2])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

