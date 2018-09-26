package <missing>;

public class GlobalMembers
{
	/*
	 * exam.cpp
	 *
	 *  Created on: 2013-10-31
	 *      Author: dyx
	 */
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] jz = new char[n][n];
		int i;
		int j;
		int k;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				jz[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);

			}
		}
		int[][][] jz1 = new int[100][n][n];
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{
					if (jz[i][j] == '.')
					{
						jz1[0][i][j] = 0;
					}
					if (jz[i][j] == '#')
					{
						jz1[0][i][j] = -100000;
					}
					if (jz[i][j] == '@')
					{
						jz1[0][i][j] = 1;
					}
				}
		}
		for (k = 1;k < 100;k++)
		{
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					jz1[k][i][j] = jz1[0][i][j];
				}
			}
		}

		int d;
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0;k < d - 1;k++)
		{
			for (i = 0;i < n;i++)
			{
					for (j = 0;j < n;j++)
					{
						if (jz1[k][i][j] > 0)
						{
							if (i == 0 && j == 0)
							{
								jz1[k + 1][1][0]++;
								jz1[k + 1][0][1]++;
							}
							else if (i == n - 1 && j == 0)
							{
								jz1[k + 1][n - 2][0]++;
								jz1[k + 1][n - 1][1]++;
							}
							else if (i == 0 && j == n - 1)
							{
								jz1[k + 1][1][n - 1]++;
								jz1[k + 1][0][n - 2]++;
							}
							else if (i == n - 1 && j == n - 1)
							{
								jz1[k + 1][n - 2][n - 1]++;
								jz1[k + 1][n - 1][n - 2]++;
							}
							else if (i == 0)
							{
								jz1[k + 1][0][j + 1]++;
								jz1[k + 1][0][j - 1]++;
								jz1[k + 1][1][j]++;
							}
							else if (j == 0)
							{
								jz1[k + 1][i + 1][j]++;
								jz1[k + 1][i - 1][j]++;
								jz1[k + 1][i][j + 1]++;
							}
							else if (i == n - 1)
							{
								jz1[k + 1][n - 1][j + 1]++;
								jz1[k + 1][n - 1][j - 1]++;
								jz1[k + 1][n - 2][j]++;
							}
							else if (j == n - 1)
							{
								jz1[k + 1][i + 1][n - 1]++;
								jz1[k + 1][i - 1][n - 1]++;
								jz1[k + 1][i][n - 2]++;
							}
							else
							{
								jz1[k + 1][i + 1][j]++;
								jz1[k + 1][i - 1][j]++;
								jz1[k + 1][i][j + 1]++;
								jz1[k + 1][i][j - 1]++;
							}
						}
					}
			}
		}

		int jishu = 0;
		for (i = 0;i < n;i++)
		{
				for (j = 0;j < n;j++)
				{ //cout <<jz1[d-1][i][j]<<" ";
					if (jz1[d - 1][i][j] > 0)
					{
						jishu++;
					}


				}
		}
		System.out.print(jishu);







	return 0;

	}

}

