package <missing>;

public class GlobalMembers
{
	//**************************
	//*???2013?12?4?     *
	//*??????            *
	//*???????????  *
	//**************************

	public static int[][] board = new int[11][11];
	public static int[][] next = new int[11][11];
	public static int m;
	public static int i;
	public static int j;
	public static int cnt = 0;
	public static int days;
	public static void spread(int days)
	{
		if (cnt == days)
		{
			return;
		}
		cnt++;
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				next[i][j] = board[i - 1][j] + board[i + 1][j] + board[i][j - 1] + board[i][j + 1] + board[i + 1][j + 1] + board[i - 1][j - 1] + board[i + 1][j - 1] + board[i - 1][j + 1] + board[i][j] * 2;
			}
		}
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				board[i][j] = next[i][j];
				next[i][j] = 0;
			}
		}
		spread(days);
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[5][5] = m;
		spread(days);
		for (i = 1; i <= 9; i++)
		{
			for (j = 1; j <= 9; j++)
			{
				if (j < 9)
				{
					System.out.print(board[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(board[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}


}

