package <missing>;

public class GlobalMembers
{
	/*
	 * ???????????.cpp
	 *
	 *  Created on: 2011-10-24
	 *      Author:???
	 */

	public static int Main()
	{
		int[][] a = new int[100][100]; //i?j?s?????????????
		int row;
		int col;
		int i;
		int j;
		int s;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (s = 0;s < row + col - 1;s++)
		{ //?????????????????s?????i????
			for (i = 0;i < row;i++)
			{
				if (s - i < col)
				{ //????if???????????????
							if (s >= i)
							{
								System.out.print(a[i][s - i]);
								System.out.print("\n");
							}
							else
							{
								break;
							}
				}
			}
		}
		return 0;
	}
}

