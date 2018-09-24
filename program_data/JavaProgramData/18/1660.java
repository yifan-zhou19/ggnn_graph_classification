package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int h;
		int p;
		int q;
		for (k = 0;k < n;k++)
		{
			sum = 0;
			int[][] board = new int[105][105];
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					board[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			for (h = 0;h < n;h++)
			{
				for (i = h;i < n;i++)
				{
					int min = board[i][h];
					for (j = h;j < n;j++)
					{
						 if (board[i][j] < min)
						 {
							 min = board[i][j];
						 }
					}
					for (j = h;j < n;j++)
					{
						board[i][j] -= min;
					}
				}
				for (j = h;j < n;j++)
				{
					int min = board[h][j];
					for (i = h;i < n;i++)
					{
						if (board[i][j] < min)
						{
							min = board[i][j];
						}
					}
					for (i = h;i < n;i++)
					{
						 board[i][j] -= min;
					}
				}
				sum += board[h + 1][h + 1];
				board[h + 1][h + 1] = board[h][h];
				for (p = h + 2;p < n;p++)
				{
					board[h + 1][p] = board[h][p];
				}
				for (p = h + 2;p < n;p++)
				{
					board[p][h + 1] = board[p][h];
				}
			}
			 System.out.print(sum);
			 System.out.print("\n");
		}
		 return 0;
	}

}

