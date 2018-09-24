package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int x;
		int y;
		int ans;
		int[][] a = new int[101][101];
		int[] p = a;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= k;i++)
		{
			ans = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (x = 0;x < m;x++)
			{
				for (y = 0;y < n;y++)
				{
					*((p[0] + y) + x) = ConsoleInput.readToWhiteSpace(true);
					if (x == 0 || y == 0 || x == m - 1 || y == n - 1)
					{
						ans = ans + *((p[0] + y) + x);
					}
				}
			}
			System.out.print(ans);
			System.out.print("\n");
		}
		return 0;
	}
}

