package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int ROW;
		int COL;
		int ROW1;
		int COL1;
		int col;
		int row;
		int n;
		int k = 0;
	int T = 0;
	int a;
	int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		ROW = n - 1;
		COL = n - 1;

		for (row = 0;row < ROW;row++)
		{
								 for (col = 0;col < COL;col++)
								 {
														 String tempVar2 = ConsoleInput.scanfRead();
														 if (tempVar2 != null)
														 {
															 sz[row][col] = Integer.parseInt(tempVar2);
														 }
								 }
		}
		for (row = 0;row < ROW;row++)
		{
								 for (col = 0;col < COL;col++)
								 {
														  if (T == 0 && sz[row][col] == 0)
														  {
																			  ROW1 = row;
																			  COL1 = col;

	T = 1;
														  }
								 }
		}
		for (row = ROW;row >= ROW1;row--)
		{
								 for (col = COL;col >= COL1;col--)
								 {
														  if (T == 0 && sz[row][col] == 0)
														  {
																			  COL = col;
	ROW = row;

	T = 1;
														  }
								 }
		}

	a = ROW - ROW1 - 3;
	b = COL - COL1 - 1;
	k = a * b;
		System.out.printf("%d",k);
		return 0;

	}


}

