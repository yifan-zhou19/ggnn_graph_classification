package <missing>;

public class GlobalMembers
{
	/*
	 * bianlishuzu.cpp
	 *
	 *  Created on: 2013-12-6
	 *      Author: ???
	 */
	public static int Main()
	{
		int row = 0;
		int col = 0;
		int i = 0;
		int j = 0;
		int[][] a = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		int sum = 0;
		for (sum = 0;sum < row + col - 1;sum++)
		{
			if (sum < col)
			{
				for (i = 0, j = sum;i < row && i <= sum;i++, j--)
				{
					System.out.print((*(a + i) + j));
					System.out.print("\n");
				}
			}
			else
			{
				for (j = col - 1, i = sum - col + 1;i < row && j >= 0;j--, i++)
				{
					System.out.print((*(a + i) + j));
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

