package <missing>;

public class GlobalMembers
{
	/*
	 * 6-4.cpp
	 *
	 *  Created on: 2011-10-28
	 *      Author: wuch
	 */



	public static int Main()
	{
		int row; //??row?col????i?j
		int col;
		int i;
		int j;
		int[][] array = new int[100][100]; //??????array
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row;i++) //????
		{
			for (j = 1;j <= col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 2;i <= row + col;i++) //?? ?+? ???????????????????
		{
			for (j = 1;j <= i - 1;j++)
			{
				if ((j <= row) && (i - j <= col))
				{
					System.out.print(array[j][i - j]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

