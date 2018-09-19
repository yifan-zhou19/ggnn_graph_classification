package <missing>;

public class GlobalMembers
{
	/*
	 * 6.cpp
	 *
	 *  Created on: 2011-11-6
	 *      Author: b
	 */

	public static int Main()
	{
		int n; //n:?????n?n*n??? N??????????? sum:??  min:????????????
		int N;
		int sum = 0;
		int min;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][][] jz = new int[n][n][n];
		int i; //????
		int j;
		int k;
		int t;

		for (k = 0;k < n;k++)
		{ //?????k+1???
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					jz[k][i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}

		for (k = 0;k < n;k++)
		{ //?????k+1???
			sum = 0;
			N = n;

			for (t = 1;t < n;t++)
			{ //???????t????t????n-1

				for (i = 0;i < N;i++)
				{ //?????????????????????????
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
				{ //?????????????????????????
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

				sum = sum + jz[k][1][1]; //????????

				for (i = 1;i < N - 1;i++)
				{
					for (j = 0;j < N;j++)
					{
						jz[k][i][j] = jz[k][i + 1][j]; //??2?,?2???
					}
				}

				for (j = 1;j < N - 1;j++)
				{
					for (i = 0;i < n;i++)
					{
						jz[k][i][j] = jz[k][i][j + 1];
					}
				}

				N = N - 1;

			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}

}

