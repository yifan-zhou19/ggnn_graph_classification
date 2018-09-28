package <missing>;

public class GlobalMembers
{
	/*
	 * 12-4.cpp
	 *
	 *  Created on: 2011-12-25
	 *      Author: sony
	 */

	public static int Main()
	{
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int u;
		for (u = 1; u <= k; u++)
		{
			int i;
			int j;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int[][] input = new int[m][n];
			int[] p = input;
			for (i = 0; i < m; i++)
			{
				for (j = 0; j < n; j++)
				{
					*(p[i] + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			int sum = 0;
			for (i = 0; i < m; i++)
			{
				sum += input[i][0] + input[i][n - 1];
			}
			for (j = 0; j < n; j++)
			{
				sum += input[0][j] + input[m - 1][j];
			}
			sum = sum - input[0][0] - input[0][n - 1] - input[m - 1][0] - input[m - 1][n - 1];
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

