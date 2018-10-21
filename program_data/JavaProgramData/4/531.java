package <missing>;

public class GlobalMembers
{
	/*
	 * Filename:homework_duijiaoxian.cpp
	 * Author: Wu Yiming
	 *  Created on: 2011-10-31
	 * Function: print it along duijiaoxian
	 */



	public static int Main()
	{
		int row;
		int col;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col];
		int i;
		int j;
		int sum;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (sum = 0;sum < col - 1;sum++)
		{
			for (j = sum;j >= 0;j--)
			{
				i = sum - j;
				if (i >= row)
				{
					break;
				}
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		for (sum = col - 1;sum <= row + col - 2;sum++)
		{
			for (j = col - 1;j >= 0;j--)
			{
				i = sum - j;
				if (i >= row)
				{
					break;
				}
				System.out.print(a[i][j]);
				System.out.print("\n");
			}
		}
		return 0;

	}

}

