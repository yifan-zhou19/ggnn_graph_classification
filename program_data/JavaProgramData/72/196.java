package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] high = new int[30][30];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				high[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				if (i == 0 && j == 0)
				{
					if (high[i][j] >= high[i + 1][j] != 0 && high[i][j] >= high[i][j + 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == 0 && j != 0)
				{
					if (high[i][j] >= high[i][j + 1] != 0 && high[i][j] >= high[i][j - 1] != 0 && high[i][j] >= high[i + 1][j])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i != 0 && j == 0)
				{
					if (high[i][j] >= high[i + 1][j] != 0 && high[i][j] >= high[i - 1][j] != 0 && high[i][j] >= high[i][j + 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j == n - 1)
				{
					if (high[i][j] > high[i - 1][j] && high[i][j] >= high[i][j - 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i == m - 1 && j != n - 1)
				{
					if (high[i][j] >= high[i - 1][j] != 0 && high[i][j] >= high[i][j + 1] != 0 && high[i][j] >= high[i][j - 1])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else if (i != m - 1 && j == n - 1)
				{
					if (high[i][j] >= high[i - 1][j] != 0 && high[i][j] >= high[i][j - 1] != 0 && high[i][j] >= high[i + 1][j])
					{
						System.out.print(i);
						System.out.print(' ');
						System.out.print(j);
						System.out.print("\n");
					}
				}
				else
				{
					if (high[i][j] >= high[i + 1][j] != 0 && high[i][j] >= high[i - 1][j] != 0 && high[i][j] >= high[i][j + 1] != 0 && high[i][j] >= high[i][j - 1])
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

