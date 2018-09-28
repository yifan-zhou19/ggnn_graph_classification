package <missing>;

public class GlobalMembers
{
	/*
	 * 1028-1.cpp
	 *
	 *  Created on: 2011-11-3
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int col;
		int row;
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < col;k++)
		{
			for (i = 0, j = k;(i < row) && (j >= 0);i++, j--)
			{
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		for (k = 1;k < row;k++)
		{
				for (i = k, j = col - 1;(i < row) && (j >= 0);i++, j--)
				{
					System.out.print(a[i][j]);
					System.out.print("\n");
				}
		}

		return 0;


	}

}

