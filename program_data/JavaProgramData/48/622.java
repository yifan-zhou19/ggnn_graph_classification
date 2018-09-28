package <missing>;

public class GlobalMembers
{
	public static int[][] board = new int[11][11];
	public static int[][] temp = new int[11][11];

	public static void increase(int day)
	{
		 if (day == 0)
		 {
				 return;
		 }
		 int i;
		 int j;
		 for (i = 1; i < 10; i++)
		 {
			 for (j = 1; j < 10; j++)
			 {
				 temp[i + 1][j + 1] += board[i][j];
				 temp[i + 1][j - 1] += board[i][j];
				 temp[i - 1][j - 1] += board[i][j];
				 temp[i - 1][j + 1] += board[i][j];
				 temp[i - 1][j] += board[i][j];
				 temp[i + 1][j] += board[i][j];
				 temp[i][j - 1] += board[i][j];
				 temp[i][j + 1] += board[i][j];
				 temp[i][j] += board[i][j];
			 }
		 }
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
		 memcpy(board, temp, (Integer.SIZE / Byte.SIZE) * 121);
		 return increase(day - 1);
	}

	public static int Main()
	{
		int num;
		int day;
		int i;
		int j;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		board[5][5] = num;
		temp[5][5] = num;
		increase(day);
		for (i = 1; i < 10; i++)
		{
			 for (j = 1; j < 9; j++)
			 {
				 System.out.print(temp[i][j]);
				 System.out.print(" ");
			 }
			 System.out.print(temp[i][j]);
			 System.out.print("\n");
		}
		return 0;
	}
}

