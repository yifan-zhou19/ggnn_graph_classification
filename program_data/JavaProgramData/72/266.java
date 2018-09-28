package <missing>;

public class GlobalMembers
{
	/*
	 * 4.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int mm = m + 2;
		final int nn = n + 2;
		int[][] a = new int[mm][nn];
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= m + 1;i++)
		{
			a[i][n + 1] = 0;
			a[i][0] = 0;
		}
		for (j = 0;j <= n + 1;j++)
		{
			a[0][j] = 0;
			a[m + 1][j] = 0;
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] < a[i - 1][j] || a[i][j] < a[i + 1][j] || a[i][j] < a[i][j - 1] || a[i][j] < a[i][j + 1])
				{
					continue;
				}
				System.out.print(i - 1);
				System.out.print(' ');
				System.out.print(j - 1);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

