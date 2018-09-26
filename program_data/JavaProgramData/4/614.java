package <missing>;

public class GlobalMembers
{
	/*
	 * 1104.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int row; //????
		int col;
		int i;
		int j;
		int k;
		int sum;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] array = new int[row][col];
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		sum = row + col;
		for (k = 2;k <= sum;k++)
		{
			for (i = 1;i <= row;i++)
			{
				for (j = col;j > 0;j--)
				{
					if (i + j == k)
					{
							System.out.print(array[i - 1][j - 1]);
							System.out.print("\n");
							break;
					} //???????????? ????
				}
			}
		}
		return 0;
	}
}

