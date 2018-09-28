package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] board = new int[9][9];
		int[][] temp = new int[9][9];
		int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(board,0,81 * (Integer.SIZE / Byte.SIZE));
		board[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp,0,81 * (Integer.SIZE / Byte.SIZE));
			for (int i = 1;i < 8;i++)
			{
				for (int j = 1;j < 8;j++)
				{
					if (board[i][j] > 0)
					{
						temp[i][j] += (2 * board[i][j]);
						temp[i - 1][j - 1] += board[i][j];
						temp[i - 1][j] += board[i][j];
						temp[i - 1][j + 1] += board[i][j];
						temp[i][j - 1] += board[i][j];
						temp[i][j + 1] += board[i][j];
						temp[i + 1][j - 1] += board[i][j];
						temp[i + 1][j] += board[i][j];
						temp[i + 1][j + 1] += board[i][j];
					}
				}
			}
			for (int i = 0;i < 9;i++)
			{
				for (int j = 0;j < 9;j++)
				{
					board[i][j] = temp[i][j];
				}
			}
		}
		for (int i = 0;i < 9;i++)
		{
			System.out.print(board[i][0]);
			for (int j = 1;j < 9;j++)
			{
				System.out.print(' ');
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

