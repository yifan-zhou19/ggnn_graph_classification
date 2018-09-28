package <missing>;

public class GlobalMembers
{
	/*
	 * homework3.cpp
	 *
	 *  Created on: 2012-12-4
	 *      Author: Lixurong
	 */


	public static int Main()
	{
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < k; i++)
		{
			int m;
			int n;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] a = new int[m][n];
			for (int i = 0; i < m; i++)
			{
				for (int j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			int s = 0;
			for (int i = 0; i < n; i++)
			{
				s += *((a) + i);
			}
			if (m > 1)
			{
			for (int i = 0; i < n; i++)
			{
						s += *(*(a + m - 1) + i);
			}
			}
			for (int i = 1; i < m - 1; i++)
			{
				s += *(*(a + i) + 0);
			}
			for (int i = 1; i < m - 1; i++)
			{
						s += *(*(a + i) + n - 1);
			}
			System.out.print(s);
			if (i != k - 1)
			{
				System.out.print("\n");
			}
		}
		return 0;
	}

}

