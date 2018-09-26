package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[m + 1][n + 1];
		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		if (m == 1)
		{
			for (int i = 1;i <= n;i++)
			{
				System.out.print(a[1][i]);
				System.out.print("\n");
			}
		}
		else if (n == 1)
		{
			for (int i = 1;i <= m;i++)
			{
						System.out.print(a[i][1]);
						System.out.print("\n");
			}
		}
		else if (m < n)
		{
			for (int i = 2;i <= m;i++)
			{
				for (int j = 1;j < i;j++)
				{
					System.out.print(a[j][i - j]);
					System.out.print("\n");
				}
			}
			for (int i = m + 1;i <= n + 1;i++)
			{
				for (int j = i - 1;j >= i - m;j--)
				{
					System.out.print(a[i - j][j]);
					System.out.print("\n");
				}
			}
			for (int i = n + 2;i <= n + m;i++)
			{
				for (int j = n;i - j <= m;j--)
				{
					System.out.print(a[i - j][j]);
					System.out.print("\n");
				}
			}
		}
		else if (m >= n)
		{
					for (int i = 2;i <= n;i++)
					{
						for (int j = 1;j < i;j++)
						{
							System.out.print(a[j][i - j]);
							System.out.print("\n");
						}
					}
					for (int i = n + 1;i <= m + 1;i++)
					{
						for (int j = n;j >= 1;j--)
						{
							System.out.print(a[i - j][j]);
							System.out.print("\n");
						}
					}
					for (int i = m + 2;i <= m + n;i++)
					{
						for (int j = n;i - j <= m;j--)
						{
							System.out.print(a[i - j][j]);
							System.out.print("\n");
						}
					}
		}
		return 0;
	}

}

