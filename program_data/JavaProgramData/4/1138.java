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
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[n][m];
		for (p = a ; p < (a) + n * m ; p++)
		{
				* p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0, j = 0 ; i < n ; i++)
		{
			for (; j < m ; j++)
			{
				p = a + m * i + j;
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

