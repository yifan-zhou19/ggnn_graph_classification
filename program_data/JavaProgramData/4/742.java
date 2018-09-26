package <missing>;

public class GlobalMembers
{
	/*
	 * erweishuzuyoushangzuoxiabianli.cpp
	 *
	 *  Created on: 2012-12-17
	 *      Author: 1200012791??
	 *      ???????row?col??????array????array[0][0]?????????????????????????
	 */
	public static int Main()
	{
		int row = 0; //??4?????
		int col = 0;
		int i = 0;
		int j = 0;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[row][col]; //??1?????
		for (i = 0; i < row; i++) //???????
		{
			for (j = 0; j < col; j++)
			{
				*(*(a + i) + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
		for (i = 0; i < col; i++) //?????????????
		{
			for (j = 0; j <= i != 0 && j < row; j++)
			{
				System.out.print((*(a + j) + i - j));
				System.out.print("\n");
			}
		}
		for (i = 1; i < row; i++) //??????????????
		{
			for (j = 0; j < row - i && j < col; j++)
			{
				System.out.print((*(a + i + j) + col - 1 - j));
				System.out.print("\n");
			}
		}
		return 0;
	}

}

