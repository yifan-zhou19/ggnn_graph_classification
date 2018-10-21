package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: lenovo
	 */
	public static int Main()
	{
		int row;
		int col;
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
		for (j = 0;j < col;j++)
		{
			for (i = 0, k = 0;i < row && (j - k) >= 0;i++, k++)
			{
				System.out.print(a[i][j - k]);
				System.out.print("\n");
			}
		}
		for (i = 1;i < row;i++)
		{
			for (j = col - 1, k = 0;j >= 0 && (i + k) < row;j--, k++)
			{
				System.out.print(a[i + k][j]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

