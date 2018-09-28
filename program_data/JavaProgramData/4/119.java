package <missing>;

public class GlobalMembers
{
	/*
	 *  Name:homework.cpp
	 *  Created on: 2012-12-10
	 *  Author: Meng Li
	 *  Function:????
	 */


	public static int Main()
	{ //???
		int col;
		int row;
		int[][] array = new int[100][100];
		int i;
		int j;
		int temp1;
		int temp2;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < row + col - 1;i++)
		{
			temp1 = (i - col + 1 > 0)?(i - col + 1):0;
			temp2 = (i - row + 1 > 0)?(row - 1):i;
			for (j = temp1;j <= temp2;j++)
			{
				System.out.print((*(array + j) + i - j));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

