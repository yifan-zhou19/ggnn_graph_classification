package <missing>;

public class GlobalMembers
{
	/*
	 * 11.6.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11095
	 */

	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] mout = new int[m][n];
		int i;
		int j;
		for (i = 0;i < m;i++)
		{ //????m*n???
			for (j = 0;j < n;j++)
			{
				mout[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		int[][] vmt = new int[m + 2][n + 2]; //?m*n?????????
		for (j = 0;j < n + 2;j++)
		{
			vmt[0][j] = 0;
			vmt[m + 1][j] = 0;
		}
		for (i = 0;i < m + 2;i++)
		{
			vmt[i][0] = 0;
			vmt[i][n + 1] = 0;
		}
		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				vmt[i][j] = mout[i - 1][j - 1];
			}
		}

		for (i = 1;i < m + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				if (vmt[i][j] >= vmt[i - 1][j] != 0 && vmt[i][j] >= vmt[i + 1][j] != 0 && vmt[i][j] >= vmt[i][j - 1] != 0 && vmt[i][j] >= vmt[i][j + 1])
				{
					i--;
					j--;
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
					i++;
					j++;
				}

			}
		}
		return 0;
	}

}

