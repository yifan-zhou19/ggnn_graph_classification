package <missing>;

public class GlobalMembers
{
	/*
	 * 11-8.cpp
	 *
	 *  Created on: 2011-11-5
	 *      Author: 11095
	 */

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int t;
		int N;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][][] jz = new int[n][n][n];
		int min;
		int sum = 0;
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					jz[k][i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}

		for (k = 0;k < n;k++)
		{
			N = n;
			sum = 0;
			for (t = 1;t < n;t++)
			{
				for (i = 0;i < N;i++)
				{ //??
					min = jz[k][i][0];
					for (j = 0;j < N;j++)
					{
						if (jz[k][i][j] < min)
						{
							min = jz[k][i][j];
						}
					}
					for (j = 0;j < N;j++)
					{
						jz[k][i][j] = jz[k][i][j] - min;
					}
				}
				for (j = 0;j < N;j++)
				{
					min = jz[k][0][j];
					for (i = 0;i < N;i++)
					{
						if (jz[k][i][j] < min)
						{
							min = jz[k][i][j];
						}
					}
					for (i = 0;i < N;i++)
					{
						jz[k][i][j] = jz[k][i][j] - min;
					}
				}

				sum = sum + jz[k][1][1];

				for (i = 1;i < N - 1;i++)
				{
					for (j = 0;j < N;j++)
					{
						jz[k][i][j] = jz[k][i + 1][j];
					}
				}

				for (j = 1;j < N - 1;j++)
				{
					for (i = 0;i < N;i++)
					{
						jz[k][i][j] = jz[k][i][j + 1];
					}
				}
				N--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

