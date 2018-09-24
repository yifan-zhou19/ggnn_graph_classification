package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-12-25
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[][] a = new int[10][10];
		int[][] b = new int[10][10];
		int i;
		int j;
		int m;
		int n;
		int p = 0;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[5][5] = m;
		for (k = 0; k < n; k++)
		{
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					if (a[i][j] != 0)
					{
						p = a[i][j];
						b[i][j] = b[i][j] + 2 * p;
						b[i - 1][j] = b[i - 1][j] + p;
						b[i + 1][j] = b[i + 1][j] + p;
						b[i - 1][j + 1] = b[i - 1][j + 1] + p;
						b[i - 1][j - 1] = b[i - 1][j - 1] + p;
						b[i][j + 1] = b[i][j + 1] + p;
						b[i][j - 1] = b[i][j - 1] + p;
						b[i + 1][j + 1] = b[i + 1][j + 1] + p;
						b[i + 1][j - 1] = b[i + 1][j - 1] + p;
					}
				}
			}
			for (i = 1; i <= 9; i++)
			{
				for (j = 1; j <= 9; j++)
				{
					a[i][j] = b[i][j];
					b[i][j] = 0;
				}
			}
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				System.out.print(a[i][j]);
				if (j != 9)
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

