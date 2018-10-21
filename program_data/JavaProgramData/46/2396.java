package <missing>;

public class GlobalMembers
{
	//  ????????



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
		int min;
		if (m >= n)
		{
			min = n;
		}
		else
		{
			min = m;
		}
		for (int i = 1;i <= (1 + min) / 2;i++)
		{
			for (int j = i;j <= n + 1 - i;j++)
			{
				if (a[i][j] != -1)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
					a[i][j] = -1;
				}
			}

			for (int j = i + 1;j <= m + 1 - i;j++)
			{
				if (a[j][n + 1 - i] != -1)
				{
					System.out.print(a[j][n + 1 - i]);
					System.out.print("\n");
					a[j][n + 1 - i] = -1;
				}
			}

			for (int j = n - i;j > i;j--)
			{
				if (a[m + 1 - i][j] != -1)
				{
					System.out.print(a[m + 1 - i][j]);
					System.out.print("\n");
					a[m + 1 - i][j] = -1;
				}

			}

			for (int j = m + 1 - i;j > i;j--)
			{
				if (a[j][i] != -1)
				{
					System.out.print(a[j][i]);
					System.out.print("\n");
					a[j][i] = -1;
				}
			}
		}

		return 0;
	}
}

