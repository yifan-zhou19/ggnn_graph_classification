package <missing>;

public class GlobalMembers
{
	public static int[][] bottle = new int[9][9];
	public static int totalday = 0;
	public static void mutiply(int day)
	{
		if (day == totalday + 1)
		{
			return;
		}
		int[][] board = new int[9][9];
		for (int i = 1;i <= 7;i++)
		{
			for (int j = 1;j <= 7;j++)
			{
				board[i][j] = board[i][j] + bottle[i][j] * 2;
				board[i - 1][j] = board[i - 1][j] + bottle[i][j];
				board[i + 1][j] = board[i + 1][j] + bottle[i][j];
				board[i][j - 1] = board[i][j - 1] + bottle[i][j];
				board[i][j + 1] = board[i][j + 1] + bottle[i][j];
				board[i - 1][j - 1] = board[i - 1][j - 1] + bottle[i][j];
				board[i - 1][j + 1] = board[i - 1][j + 1] + bottle[i][j];
				board[i + 1][j - 1] = board[i + 1][j - 1] + bottle[i][j];
				board[i + 1][j + 1] = board[i + 1][j + 1] + bottle[i][j];
			}
		}
		for (int i = 0;i <= 8;i++)
		{
			for (int j = 0;j <= 8;j++)
			{
				bottle[i][j] = board[i][j];
			}
		}
		mutiply(day + 1);
	}
	public static int Main()
	{
		bottle[4][4] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day;
		totalday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		mutiply(1);
		for (int i = 0;i <= 8;i++)
		{
			System.out.print(bottle[i][0]);
			for (int j = 1;j <= 8;j++)
			{
				System.out.print(' ');
				System.out.print(bottle[i][j]);
			}
			System.out.print("\n");
		}
	}

}

