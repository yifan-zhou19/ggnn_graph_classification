package <missing>;

public class GlobalMembers
{
	/*
	 * try_second.cpp
	 *
	 *  Created on: 2012-12-9
	 *      Author: ada
	 */
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		for (int i = 0 ; i < m ; i++)
		{
			for (int j = 0 ; j < n ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0 ; i < (m + n) ; i++)
		{
			for (int j = 0 ; j < m ; j++)
			{
				for (int k = 0 ; k < n ; k++)
				{
					if (j + k == i)
					{
						System.out.print(a[j][k]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

