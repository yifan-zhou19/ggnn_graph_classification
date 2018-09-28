package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*?????? 1300012713 **
	//*???2013.12.05  **
	//********************************
	public static int[][] board = new int[10][10]; //??????????
	public static int[][] board1 = new int[10][10]; //??????????
	public static void day(int a, int b, int c) //?????????a??????b????c
	{
		if (a == c) //?????
		{
			for (int i = 1; i <= 9; i++)
			{
				for (int j = 1; j <= 9; j++)
				{
					System.out.print(board[i][j]);
					if (j < 9)
					{
						System.out.print(" ");
					}
					if (j == 9)
					{
						System.out.print("\n");
					}
				}
			}
			return;
		}
		for (int k = 1; k <= 9; k++) //??
		{
			for (int l = 1; l <= 9; l++)
			{
				if (board[k][l] != 0) //?????????????????????
				{
					if (k > 1)
					{
						board1[k - 1][l] += board[k][l];
					}
					if (k < 9)
					{
						board1[k + 1][l] += board[k][l];
					}
					if (l > 1)
					{
						board1[k][l - 1] += board[k][l];
					}
					if (l < 9)
					{
						board1[k][l + 1] += board[k][l];
					}
					if (k > 1 && l > 1)
					{
						board1[k - 1][l - 1] += board[k][l];
					}
					if (k > 1 && l < 9)
					{
						board1[k - 1][l + 1] += board[k][l];
					}
					if (k < 9 && l > 1)
					{
						board1[k + 1][l - 1] += board[k][l];
					}
					if (k < 9 && l < 9)
					{
						board1[k + 1][l + 1] += board[k][l];
					}
					board1[k][l] += board[k][l] * 2;
					board[k][l] = 0;
				}
			}
		}
		for (int p = 1; p <= 9; p++) //????????????????
		{
			for (int q = 1; q <= 9; q++)
			{
				board[p][q] = board[p][q] + board1[p][q];
				board1[p][q] = 0;
			}
		}
		day(a + 1, b, c); //?????
	}
	public static int Main()
	{

		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[5][5] = m; //?????
		day(0, m, n); //??
		return 0;
	}


}

