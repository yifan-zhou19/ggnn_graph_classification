package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ??????????
	//
	//  Created by mac on 12-12-13.
	//  Copyright (c) 2012? mac. All rights reserved.
	//

	public static int Main()
	{
		int max;
		int row;
		int col;
		int[][] array = new int[100][100];
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < row;i++)
		{
			for (int j = 0;j < col;j++)
			{
				array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[] p = new int[100];
		p = array;
		for (int i = 0;i < col;i++)
		{
		for (int j = i;j >= 0;j--)
		{
			if ((i - j) < row)
			{
			System.out.print((p[i - j] + j));
			System.out.print("\n");
			}
		}
		}
		if (row > col)
		{
			max = row;
		}
		else
		{
			max = col;
		}
		for (int i = col;i <= col + row - 1;i++)
		{
			for (int j = col - 1;j >= 0;j--)
			{
				if ((i - j) < row && i - col + 1 >= 0)
				{
				System.out.print((p[i - j] + j));
				System.out.print("\n");
				}
			}
		}
	}

}

