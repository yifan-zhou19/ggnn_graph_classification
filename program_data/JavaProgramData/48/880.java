package <missing>;

public class GlobalMembers
{
	public static int[][] board = new int[9][9];
	public static int[][] temp = new int[9][9];
	public static void spread()
	{
		 int i;
		 int j;
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					temp[i][j] += 2 * board[i][j];
					if (i > 0)
					{
							temp[i - 1][j] += board[i][j];
					}
					if (j > 0)
					{
							temp[i][j - 1] += board[i][j];
					}
					if (i < 8)
					{
							temp[i + 1][j] += board[i][j];
					}
					if (j < 8)
					{
							temp[i][j + 1] += board[i][j];
					}
					if (i < 8 && j < 8)
					{
							temp[i + 1][j + 1] += board[i][j];
					}
					if (i < 8 && j>0)
					{
							temp[i + 1][j - 1] += board[i][j];
					}
					if (i > 0 && j < 8)
					{
							temp[i - 1][j + 1] += board[i][j];
					}
					if (i > 0 && j > 0)
					{
							temp[i - 1][j - 1] += board[i][j];
					}
				}
			}
	}
	public static void turn()
	{
		 int i;
		 int j;
		 for (i = 0;i < 9;i++)
		 {
			 for (j = 0;j < 9;j++)
			 {
				 board[i][j] = temp[i][j];
			 }
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		 memset(temp, 0, (Integer.SIZE / Byte.SIZE));
	}
	public static int Main()
	{
		int zhongxin;
		zhongxin = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[4][4] = zhongxin;
		int days;
		days = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= days;i++)
		{
			spread();
			turn();
		}
		for (i = 0;i < 9;i++)
		{
			System.out.print(board[i][0]);
			for (j = 1;j < 9;j++)
			{
				System.out.print(" ");
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
		return 0;
	}
}

