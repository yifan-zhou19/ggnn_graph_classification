package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????????
	//
	//  Created by ?? on 12-12-15.
	//  Copyright (c) 2012? ??. All rights reserved.
	//

	public static int[][] board = new int[9][9];
	public static void production(int days)
	{
		int[][] separation = new int[9][9];
		int i;
		int j;
		if (days == 0)
		{
			return;
		}
		else
		{
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					board[i][j] *= 10;
					separation[i][j] = (board[i][j] - 2 * board[i][j] / 10) / 8;
					board[i][j] = 2 * board[i][j] / 10;
				}
			}
			for (i = 0; i < 9; i++)
			{
				for (j = 0; j < 9; j++)
				{
					board[i + 1][j] += separation[i][j];
					board[i - 1][j] += separation[i][j];
					board[i][j + 1] += separation[i][j];
					board[i][j - 1] += separation[i][j];
					board[i + 1][j + 1] += separation[i][j];
					board[i - 1][j + 1] += separation[i][j];
					board[i + 1][j - 1] += separation[i][j];
					board[i - 1][j - 1] += separation[i][j];
				}
			}
			production(days - 1);
		}
	}
	public static int Main()
	{
		int num;
		int days;
		int i;
		int j;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[4][4] = num;
		production(days);
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				if (j == 8)
				{
					System.out.print(board[i][j]);
					System.out.print("\n");
				}
				else
				{
					System.out.print(board[i][j]);
					System.out.print(" ");
				}
			}
		}
		return 0;
	}
}

