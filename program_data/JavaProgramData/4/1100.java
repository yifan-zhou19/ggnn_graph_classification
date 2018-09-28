package <missing>;

public class GlobalMembers
{
	/*
	 * youshang-zuoxia-bianli.cpp
	 *
	 *  Created on: 2013-12-6
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int x;
		int y;
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int n;
		n = row + col - 2;
		for (int i = 0;i < col;i++)
		{
			for (x = 0, y = i - x; x >= 0 && y >= 0 && x < row && y < col ; x++, y--)
			{

				System.out.print(a[x][y]);
				System.out.print("\n");
			}
		}
		for (int j = col;j <= n;j++)
		{
			for (y = col - 1, x = j - y; x >= 0 && y >= 0 && x < row && y < col ; y--, x++)
			{
				System.out.print(a[x][y]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

