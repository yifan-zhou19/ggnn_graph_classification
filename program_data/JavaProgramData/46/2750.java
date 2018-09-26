package <missing>;

public class GlobalMembers
{
	/*
	 * huixingbianli.cpp
	 *
	 *  Created on: 2012-12-8
	 *      Author: Lenovo
	 */
	public static int[][] array = new int[100][100];
	public static int row;
	public static int col;
	public static void out(int beginx,int beginy,int r,int c)
	{
		if (r == 0 || c == 0)
		{
			return;
		}
		int x;
		int y;
		if (r == 1)
		{
			for (x = beginx;x < beginx + c;x++)
			{
				System.out.print(array[beginy][x]);
				System.out.print("\n");
			}
			return;
		}
		if (c == 1)
		{
			for (y = beginy;y < beginy + r;y++)
			{
				System.out.print(array[y][beginx]);
				System.out.print("\n");
			}
			return;
		}
		for (x = beginx;x < beginx + c;x++)
		{
			System.out.print(array[beginy][x]);
			System.out.print("\n");
		}
		x--;
		for (y = beginy + 1;y < beginy + r;y++)
		{
			System.out.print(array[y][x]);
			System.out.print("\n");
		}
		y--;
		for (x = x - 1;x >= beginx;x--)
		{
			System.out.print(array[y][x]);
			System.out.print("\n");
		}
		x++;
		for (y = y - 1;y > beginy;y--)
		{
			System.out.print(array[y][x]);
			System.out.print("\n");
		}
		beginx++;
		beginy++;
		r -= 2;
		c -= 2;
		out(beginx, beginy, r, c);
	}
	public static int Main()
	{

		int row;
		int col;
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		out(0, 0, row, col);
		return 0;
	}

}

