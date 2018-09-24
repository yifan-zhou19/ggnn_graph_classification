package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[9][9];
	public static int[][] board = new int[9][9];
	public static void add(int i, int j)
	{
		if (a[i][j] > 0)
		{
			int m;
			m = a[i][j];
			a[i][j] = 0;
			board[i][j] = board[i][j] + m * 2;
			board[i + 1][j] = board[i + 1][j] + m;
			board[i - 1][j] = board[i - 1][j] + m;
			board[i][j + 1] = board[i][j + 1] + m;
			board[i][j - 1] = board[i][j - 1] + m;
			board[i + 1][j + 1] = board[i + 1][j + 1] + m;
			board[i + 1][j - 1] = board[i + 1][j - 1] + m;
			board[i - 1][j + 1] = board[i - 1][j + 1] + m;
			board[i - 1][j - 1] = board[i - 1][j - 1] + m;
			add(i + 1, j);
			add(i - 1, j);
			add(i, j + 1);
			add(i, j - 1);
			add(i + 1, j + 1);
			add(i - 1, j - 1);
			add(i + 1, j - 1);
			add(i - 1, j + 1);
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int d;
		int sum = 0;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < 9 ; i++)
		{
			for (j = 0 ; j < 9 ; j++)
			{
				a[i][j] = 0;
			}
		}
		a[4][4] = m;
		for (k = 0 ; k < d ; k++)
		{
			for (i = 0 ; i < 9 ; i++)
			{
				for (j = 0 ; j < 9 ; j++)
				{
					board[i][j] = 0;
				}
			}
			add(4, 4);
			for (i = 0 ; i < 9 ; i++)
			{
				for (j = 0 ; j < 9 ; j++)
				{
					a[i][j] = board[i][j];
				}
			}
		}
		for (i = 0 ; i < 9 ; i++)
		{
			for (j = 0 ; j < 8 ; j++)
			{
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.print(a[i][8]);
			System.out.print("\n");
		}
		return 0;
	}

}

