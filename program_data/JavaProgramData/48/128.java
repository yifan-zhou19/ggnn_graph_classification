package <missing>;

public class GlobalMembers
{
	/*
	 * Q6.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */



	public static int[][] board = new int[9][9];

	public static void printBoard()
	{
		int i;
		int j;
		for (i = 0; i < 9; i++)
		{
			System.out.print(board[i][0]);
			for (j = 1; j < 9; j++)
			{
				System.out.print(" ");
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
	}

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(board, 0, (Integer.SIZE / Byte.SIZE));

		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		board[4][4] = m;
		for (i = 3; i < 6; i++)
		{
			for (j = 3; j < 6; j++)
			{
				board[i][j] += m;
			}
		}

		int[][] temp = new int[9][9];
		if (n >= 2)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 3; i < 6; i++)
			{
				for (j = 3; j < 6; j++)
				{
					board[i][j] *= 2;
					temp[i][j] = board[i][j];
				}
			}
			//printBoard();
			for (i = 3; i < 6; i++)
			{
				for (j = 3; j < 6; j++)
				{
					board[i - 1][j] += temp[i][j] / 2;
					board[i + 1][j] += temp[i][j] / 2;
					board[i][j + 1] += temp[i][j] / 2;
					board[i][j - 1] += temp[i][j] / 2;
					board[i - 1][j - 1] += temp[i][j] / 2;
					board[i + 1][j + 1] += temp[i][j] / 2;
					board[i - 1][j + 1] += temp[i][j] / 2;
					board[i + 1][j - 1] += temp[i][j] / 2;
				}
			}
		}

		if (n >= 3)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 2; i < 7; i++)
			{
				for (j = 2; j < 7; j++)
				{
					board[i][j] *= 2;
					temp[i][j] = board[i][j];
				}
			}
			for (i = 2; i < 7; i++)
			{
				for (j = 2; j < 7; j++)
				{
					board[i - 1][j] += temp[i][j] / 2;
					board[i + 1][j] += temp[i][j] / 2;
					board[i][j + 1] += temp[i][j] / 2;
					board[i][j - 1] += temp[i][j] / 2;
					board[i - 1][j - 1] += temp[i][j] / 2;
					board[i + 1][j + 1] += temp[i][j] / 2;
					board[i - 1][j + 1] += temp[i][j] / 2;
					board[i + 1][j - 1] += temp[i][j] / 2;
				}
			}
		}

		if (n >= 4)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp, 0, (Integer.SIZE / Byte.SIZE));
			for (i = 1; i < 8; i++)
			{
				for (j = 1; j < 8; j++)
				{
					board[i][j] *= 2;
					temp[i][j] = board[i][j];
				}
			}
			for (i = 1; i < 8; i++)
			{
				for (j = 1; j < 8; j++)
				{
					board[i - 1][j] += temp[i][j] / 2;
					board[i + 1][j] += temp[i][j] / 2;
					board[i][j + 1] += temp[i][j] / 2;
					board[i][j - 1] += temp[i][j] / 2;
					board[i - 1][j - 1] += temp[i][j] / 2;
					board[i + 1][j + 1] += temp[i][j] / 2;
					board[i - 1][j + 1] += temp[i][j] / 2;
					board[i + 1][j - 1] += temp[i][j] / 2;
				}
			}
		}

		printBoard();
		return 0;
	}

}

