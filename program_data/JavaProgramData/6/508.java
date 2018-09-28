package <missing>;

public class GlobalMembers
{
	/*
	 * t3_3.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Lenovo
	 */
	public static int Main()
	{
		int[][] juzhen = new int[101][101];
		int m;
		int n;
		int i;
		int j;
		int sum;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			sum = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				juzhen[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (i == 0)
				{
					sum += juzhen[i][j];
				}
				if (i == m - 1)
				{
					sum += juzhen[i][j];
				}
				if (j == 0 && i != 0 && i != m - 1)
				{
					sum += juzhen[i][j];
				}
				if (j == n - 1 && i != 0 && i != m - 1)
				{
					sum += juzhen[i][j];
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		k--;
		}
		return 0;
	}

}

