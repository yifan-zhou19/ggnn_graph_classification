package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static char[][] board = new char[105][105];
	public static int[][] mark = new int[105][105];
	public static void f(int x)
	{
		if (x == m)
		{
			return;
		}
		else
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (board[i][j] == '@' && mark[i][j] != x)
					{
						if (board[i][j - 1] == '.')
						{
							board[i][j - 1] = '@';
							mark[i][j - 1] = x;
						}
						if (board[i][j + 1] == '.')
						{
							board[i][j + 1] = '@';
							mark[i][j + 1] = x;
						}
						if (board[i + 1][j] == '.')
						{
							board[i + 1][j] = '@';
							mark[i + 1][j] = x;
						}
						if (board[i - 1][j] == '.')
						{
							board[i - 1][j] = '@';
							mark[i - 1][j] = x;
						}
					}
				}
			}
				f(x + 1);
		}
	}
	public static int Main()
	{
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= 104;i++)
		{
			for (int j = 1;j <= 104;j++)
			{
				board[i][j] == '#';
			}
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				board[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (board[i][j] == '@')
				{
					mark[i][j] = 0;
				}
				else
				{
					mark[i][j] = -1;
				}
			}
		}
		if (m == 1)
		{
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (board[i][j] == '@')
					{
						sum++;
					}
				}
			}
			System.out.print(sum);
		}
		else
		{
			f(1);
			for (int i = 1;i <= n;i++)
			{
				for (int j = 1;j <= n;j++)
				{
					if (board[i][j] == '@')
					{
						sum++;
					}
				}
			}
				System.out.print(sum);
		}
		return 0;
	}
}

