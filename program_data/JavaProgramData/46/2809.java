package <missing>;

public class GlobalMembers
{
	/*
	 * ????????.cpp
	 *
	 *  Created on: 2012-12-27
	 *      Author: i
	 */
	public static int[][] a = new int[103][103];
	public static int n = 0;
	public static int m = 0;
	public static void shuchu(int hang,int lie)
	{
		int i = 0;
		if ((n % 2 == 0 && hang >= n / 2) || (m % 2 == 0 && lie >= m / 2))
		{
		}
		else if (m % 2 == 1 && lie == m / 2)
		{
			for (i = hang;i < n - hang;i++)
			{
				System.out.print(a[i][lie]);
				System.out.print("\n");
			}
		}
		else if (n % 2 == 1 && hang == n / 2)
		{
			for (i = lie;i < m - lie;i++)
			{
				System.out.print(a[hang][i]);
				System.out.print("\n");
			}
		}
		else
		{
			for (i = lie;i < m - lie;i++)
			{
				System.out.print(a[hang][i]);
				System.out.print("\n");
			}
			for (i = hang + 1;i < n - hang;i++)
			{
				System.out.print(a[i][m - lie-1]);
				System.out.print("\n");
			}
			for (i = m - lie-2;i >= lie;i--)
			{
				System.out.print(a[n - hang - 1][i]);
				System.out.print("\n");
			}
			for (i = n - hang - 2;i >= hang + 1;i--)
			{
				System.out.print(a[i][lie]);
				System.out.print("\n");
			}
			shuchu(hang + 1, lie+1);
		}
	}
	public static int Main()
	{
		int i = 0;
		int j = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		shuchu(0, 0);
		return 0;
	}

}

