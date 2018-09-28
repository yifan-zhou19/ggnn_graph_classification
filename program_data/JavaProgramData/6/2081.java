package <missing>;

public class GlobalMembers
{
	/*
	 * EdgeSum.cpp
	 *
	 *  Created on: 2012-12-12
	 *  Author: ??
	 *  ?????????????
	 */


	public static int Main()
	{
		int k;
		int m;
		int n;
		int[][] a = new int[110][110];
		int sum = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0 ; t < k ; t++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0 ; i < m ; i++)
			{
				for (int j = 0 ; j < n ; j++)
				{
					*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			if (m == 1)
			{
				for (int i = 0 ; i < n ; i++)
				{
				sum += *((a) + i);
				}
				System.out.print(sum);
				System.out.print("\n");
				continue;
			}
			if (n == 1)
			{
				for (int i = 0 ; i < m ; i++)
				{
					sum += *((a) + i);
				}
				System.out.print(sum);
				System.out.print("\n");
				continue;
			}
			for (int i = 0 ; i < n ; i++)
			{
				sum = sum + *((a) + i) + *(*(a + m - 1) + i); //??????
			}
			for (int i = 0 ; i < m ; i++)
			{
				sum = sum + *(*(a + i)) + *(*(a + i) + n - 1); //??????
			}
			System.out.print(sum - *(a) - *((a) + n - 1) - *(*(a + m - 1)) - *(*(a + m - 1) + n - 1));
			System.out.print("\n");
		}
		return 0;
	}


}

