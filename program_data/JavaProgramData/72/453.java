package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] board = new int[100][100];
		int[][] boards = new int[100][100];
		int i;
		int j;
		int n;
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 2; i <= m + 1; i++)
		{
			for (j = 2; j <= n + 1; j++)
			{
				board[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 2; i <= m + 1; i++)
		{
			for (j = 2; j <= n + 1; j++)
			{
				int s1 = (board[i][j] >= board[i][j + 1]);
				int s2 = (board[i][j] >= board[i][j - 1]);
				int s3 = (board[i][j] >= board[i + 1][j]);
				int s4 = (board[i][j] >= board[i - 1][j]);
				if (s1 + s2 + s3 + s4 == 4)
				{
					boards[i][j] = 1;
				}
			}
		}

		for (i = 2; i <= m + 1; i++)
		{
			for (j = 2; j <= n + 1; j++)
			{
				if (boards[i][j] == 1)
				{
					System.out.print(i - 2);
					System.out.print(" ");
					System.out.print(j - 2);
					System.out.print("\n");
				}
			}

		}


	return 0;
	}

}

