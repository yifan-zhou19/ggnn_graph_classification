package <missing>;

public class GlobalMembers
{
	/*
	 * ewszyszxbl.cpp
	 * ??????????
	 *  Created on: 2012-12-10
	 *      Author: Salforever
	 */

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,row,col,array[105][105],i,j;
		int p; //????
		int row;
		int col;
		int[][] array = new int[105][105];
		int i;
		int j;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= row;i++) //????
		{
			for (j = 1;j <= col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (j = 1;j <= col;j++) //???????????
		{
			p = array[1][j];
			for (i = 1;i <= j != 0 && i <= row;i++)
			{
				System.out.print(p);
				System.out.print("\n");
				p = p + 104;
			}
		}
		for (i = 2;i <= row;i++) //?????????????
		{
			p = array[i][col];
			for (j = 1;j <= col != 0 && j + i <= row + 1;j++)
			{
				System.out.print(p);
				System.out.print("\n");
				p = p + 104;
			}
		}
		return 0;
	}

}

