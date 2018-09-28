package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11294
	 */
	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		int i;
		int j;
		for (i = 0; i < row; i++)
		{
			for (j = 0; j < col; j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int p = 0;
		for (; !(2 * p >= col - 2 || 2 * p >= row - 2);)
		{
			for (i = p; i <= col - 2 - p; i++)
			{
				System.out.print(array[p][i]);
				System.out.print("\n");
			}
			for (j = p; j <= row - 2 - p; j++)
			{
				System.out.print(array[j][col - 1 - p]);
				System.out.print("\n");
			}
			for (i = p; i <= col - 2 - p; i++)
			{
				System.out.print(array[row - 1 - p][col - i - 1]);
				System.out.print("\n");
			}
			for (j = p; j <= row - 2 - p; j++)
			{
				System.out.print(array[row - 1 - j][p]);
				System.out.print("\n");
			}
			p++;
		}
		if (col == row)
		{
			for (i = p; i <= col - 1 - p; i++)
			{
				System.out.print(array[p][i]);
				System.out.print("\n");
			}
			if (col % 2 == 0)
			{
			for (i = col - 1 - p; i >= p; i--)
			{
				System.out.print(array[p + 1][i]);
				System.out.print("\n");
			}
			}
		}
		if (col > row)
		{
			for (i = p; i <= col - 1 - p; i++)
			{
				System.out.print(array[p][i]);
				System.out.print("\n");
			}
			if (row % 2 == 0)
			{
			for (i = col - 1 - p; i >= p; i--)
			{
				System.out.print(array[p + 1][i]);
				System.out.print("\n");
			}
			}
		}
		if (col < row)
		{
			for (i = p; i <= row - 1 - p; i++)
			{
				System.out.print(array[i][p]);
				System.out.print("\n");
			}
			if (col % 2 == 0)
			{
			for (i = row - 1 - p;i >= p; i--)
			{
				System.out.print(array[i][p + 1]);
				System.out.print("\n");
			}
			}
		}
		return 0;
	}

}

