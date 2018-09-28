package <missing>;

public class GlobalMembers
{
	public static final int Length = 9;
	public static int[][] board = new int[Length][Length];
	public static void f(int m, int n)
	{
		int i;
		int j;
		int[][] temp = new int[Length][Length];
		if (n == 0)
		{
			board[4][4] = m;
		}
		else
		{
			f(m, n - 1);
			for (i = 0;i < Length;i++)
			{
				for (j = 0;j < Length;j++)
				{
					temp[i][j] = board[i][j];
					board[i][j] = 0;
				}
			}
			for (i = 0; i < Length ; i++)
			{
				for (j = 0; j < Length ;j++)
				{
					if (temp[i][j] != 0)
					{
						board[i][j] += temp[i][j] * 2;
						board[i + 1][j] += temp[i][j];
						board[i - 1][j] += temp[i][j];
						board[i][j + 1] += temp[i][j];
						board[i][j - 1] += temp[i][j];
						board[i - 1][j - 1] += temp[i][j];
						board[i + 1][j + 1] += temp[i][j];
						board[i - 1][j + 1] += temp[i][j];
						board[i + 1][j - 1] += temp[i][j];
					}
				}
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		f(m, n);
		for (i = 0;i < Length;i++)
		{
			for (j = 0;j < Length - 1;j++)
			{
				System.out.print(board[i][j]);
				System.out.print(" ");
			}
			System.out.print(board[i][Length - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

