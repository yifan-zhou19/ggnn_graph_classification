package <missing>;

public class GlobalMembers
{
	/*
	 * point1005.cpp
	 *
	 *  Created on: 2013-12-4
	 *      Author: weng
	 */


	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][m];
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < m ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int * p = null;
		int p = null;
		for (i = 0, j = 0 ; i < n ; i++)
		{
			for (; j < m ; j++)
			{
				p = a[0][0] + m * i + j;
				for (int k = 0 ; k <= j != 0 && k <= m != 0 && k <= n != 0 && k < n - i ; k++)
				{
					System.out.print((p + (m - 1) * k));
					System.out.print("\n");
				}
			}
			j--;
		}
		return 0;
	}

}

