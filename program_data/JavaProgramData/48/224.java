package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;

	public static int[][][] board = new int[2][9][9];

	public static void fanzhi(int k)
	{
		if (k == n)
		{
			return;
		}

		int s = k % 2;
		int i;
		int j;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{

				board[1 - s][i - 1][j] += board[s][i][j];
				board[1 - s][i + 1][j] += board[s][i][j];
				board[1 - s][i][j - 1] += board[s][i][j];
				board[1 - s][i][j + 1] += board[s][i][j];
				board[1 - s][i + 1][j + 1] += board[s][i][j];
				board[1 - s][i - 1][j + 1] += board[s][i][j];
				board[1 - s][i + 1][j - 1] += board[s][i][j];
				board[1 - s][i - 1][j - 1] += board[s][i][j];
				board[1 - s][i][j] += board[s][i][j] * 2;

				board[s][i][j] = 0;
			}
		}

		fanzhi(k + 1);
		return;
	}
	public static int Main()
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[0][4][4] = m;


		fanzhi(0);


		int i;
		int j;
		int p = n % 2;
		for (i = 0; i < 9; i++)
		{
			int shou = 0;
			for (j = 0; j < 9; j++)
			{
				if (shou != 0)
				{
					System.out.print(" ");
				}
				shou = 1;

				System.out.print(board[p][i][j]);
			}
			System.out.print("\n");
		}

	return 0;
	}
}

