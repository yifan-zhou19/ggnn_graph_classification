package <missing>;

public class GlobalMembers
{
	/*
	 * youshangzuoxiabianli.cpp
	 *?????????? 
	 *  Created on: 2012-12-11
	 *      Author: ???
	 */
	public static int Main()
	{
		int row; //????????????
		int col;
		int[][] array = new int[100][100];
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < col;k++)
		{ //?????????????
			System.out.print(array[0][k]);
			System.out.print("\n");
			for (i = 1,j = k - 1;;i++,j--)
			{
				if (i < row && j >= 0)
				{
				System.out.print(array[i][j]);
				System.out.print("\n");
				}
				else
				{
					break; //???????
				}
			}
		}
		for (k = 1;k < row;k++)
		{ //??????????????????
			System.out.print(array[k][col - 1]);
			System.out.print("\n");
			for (i = k + 1,j = col - 2;;i++,j--)
			{
				if (i < row && j >= 0)
				{
				System.out.print(array[i][j]);
				System.out.print("\n");
				}
				else
				{
					break;
				}
			}
		}
		return 0;
	}

}

