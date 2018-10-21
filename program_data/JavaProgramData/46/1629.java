package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: ???
	 */

	public static void hxprint(int[][] a, int n, int m)
	{ //??????????????????
		int i;
		int j;
		int[][] b = new int[100][100];
		if (n == 0 || m == 0)
		{ //??????0???
			return;
		}
		else
		{
			for (j = 0;j < m;j++) //????????
			{
				System.out.print(a[0][j]);
				System.out.print("\n");
			}
			for (i = 1;i < n;i++)
			{
				System.out.print(a[i][m - 1]);
				System.out.print("\n");
			}
			if (n == 1 || m == 1)
			{
				return; //?????????
			}
			else
			{
				for (j = m - 2;j >= 0;j--) //????????????
				{
					System.out.print(a[n - 1][j]);
					System.out.print("\n");
				}
				for (i = n - 2;i >= 1;i--)
				{
					System.out.print(a[i][0]);
					System.out.print("\n");
				}
				for (i = 0;i < n - 2;i++)
				{
					for (j = 0;j < m - 2;j++)
					{
						b[i][j] = a[i + 1][j + 1];
					}
				}
				hxprint(b, n - 2, m - 2); //?????????
			}
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[100][100];
		int n;
		int m;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		hxprint(a, n, m);
		return 0;
	}
}

