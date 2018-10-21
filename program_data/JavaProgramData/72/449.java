package <missing>;

public class GlobalMembers
{
	/*
	 * 1234.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: c130
	 */
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[21][21];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			a[i][0] = 0;
			a[i][n + 1] = 0;
		}
		for (i = 0;i < m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 1;j <= n;j++)
		{
			if (a[0][j] >= a[0][j - 1] != 0 && a[0][j] >= a[0][j + 1] != 0 && a[0][j] >= a[1][j])
			{
				System.out.print(0);
				System.out.print(" ");
				System.out.print(j - 1);
				System.out.print("\n");
			}
		}
		for (i = 1;i < m - 1;i++)
		{
				for (j = 1;j <= n;j++)
				{
					if (a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
					{
						System.out.print(i);
						System.out.print(" ");
						System.out.print(j - 1);
						System.out.print("\n");
					}
				}
		}
		for (j = 1;j <= n;j++)
		{
				if (a[m - 1][j] >= a[m - 1][j - 1] != 0 && a[m - 1][j] >= a[m - 1][j + 1] != 0 && a[m - 1][j] >= a[m - 2][j])
				{
					System.out.print(m - 1);
					System.out.print(" ");
					System.out.print(j - 1);
					System.out.print("\n");
				}
		}
		return 0;
	}

}

