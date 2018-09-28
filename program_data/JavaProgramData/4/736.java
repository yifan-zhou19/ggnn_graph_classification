package <missing>;

public class GlobalMembers
{
	public static int ROW;
	public static int COL;
	public static int[][] ARRAY = new int[MAXN][MAXN];

	public static int Main()
	{
		ROW = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		COL = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < ROW;i++)
		{
			for (int j = 0;j < COL;j++)
			{
				ARRAY[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int iterx = 0;
		int itery = 0;
		for (int iter = 1;iter <= (ROW + COL - 1);iter++)
		{
			if (iter <= COL)
			{
				iterx = 0;
				itery = iter - 1;
			}
			else
			{
				iterx = iter - COL;
				itery = COL - 1;
			}
			while (iterx < ROW && itery >= 0)
			{
				System.out.print(ARRAY[iterx][itery]);
				System.out.print("\n");
				iterx++;
				itery--;
			}
		}
		return 0;
	}
}

