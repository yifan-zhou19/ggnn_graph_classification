package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[100][100];
	public static int Main()
	{
		int k;
		int ROW;
		int COL;
		int row;
		int col;
		int time = 0;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < ROW;row++)
		{
			for (col = 0;col < COL;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (k = 0;k < 100;k++)
		{
			for (col = k;col < COL - k - 1;col++)
			{
				System.out.printf("%d\n",sz[k][col]);
				time++;
					if (time == COL * ROW)
					{
						m = 1;
						break;
					}
			}
			for (row = k;row < ROW - k - 1;row++)
			{
				if (m == 1)
				{
					break;
				}
				System.out.printf("%d\n",sz[row][COL - k - 1]);
				time++;
				if (time == COL * ROW)
				{
						m = 1;
						break;
				}
			}
			for (col = COL - k - 1;col > k;col--)
			{
				if (m == 1)
				{
					break;
				}
				System.out.printf("%d\n",sz[ROW - k - 1][col]);
				time++;
				if (time == COL * ROW)
				{
						m = 1;
						break;
				}
			}
			for (row = ROW - k - 1;row > k;row--)
			{
				if (m == 1)
				{
					break;
				}
				System.out.printf("%d\n",sz[row][k]);
				time++;
	 //           printf("time=%d\n",time);
				if (time == COL * ROW)
				{
						m = 1;
						break;
				}
			}
			if (time == COL * ROW - 1)
			{
				System.out.printf("%d",sz[(ROW - 1) / 2][(COL - 1) / 2]);
				break;
			}
		if (m == 1)
		{
			break;
		}
		}
			return 0;
	}


}

