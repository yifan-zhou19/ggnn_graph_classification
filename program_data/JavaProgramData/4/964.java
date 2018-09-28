package <missing>;

public class GlobalMembers
{
	/*
	 * bianli.cpp
	 *
	 *  Created on: 2012-12-14
	 *      Author: dell
	 */
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int[][] p = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				p[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		} //??p
		for (i = 0;i < row + col - 1;i++)
		{
			for (j = 0;j < i + 1 && j < row;j++)
			{
				if (i - j >= col)
				{
					continue;
				}
				System.out.print((*(p + j) + i - j));
				System.out.print("\n");
			} //??????????????????
		}
		return 0;
	} //?????

}

