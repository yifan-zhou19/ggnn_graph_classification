package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] board = new int[11][11][2];
		int i;
		int j;
		int k;
		int m; //m???????????n???????
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[5][5][0] = m;

		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					board[i][j][1] = board[i][j][0] * 2 + board[i - 1][j - 1][0] + board[i - 1][j][0] + board[i - 1][j + 1][0] + board[i][j - 1][0] + board[i][j + 1][0] + board[i + 1][j - 1][0] + board[i + 1][j][0] + board[i + 1][j + 1][0];
				}
			}
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
				board[i][j][0] = board[i][j][1];
				}
			}
		}

			for (i = 1;i <= 9;i++)
			{
				System.out.print(board[i][1][1]);
				for (j = 2;j <= 9;j++)
				{
					System.out.print(' ');
					System.out.print(board[i][j][1]);
				}
				System.out.print("\n");
			}
		return 0;
	}
}

