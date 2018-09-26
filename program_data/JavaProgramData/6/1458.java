package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] jz = new int[100][100];
		int ROW;
		int COL;
		int[] h = new int[100];
		int y;
		int i;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ROW = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				COL = Integer.parseInt(tempVar3);
			}
			for (row = 0; row < ROW; row++)
			{
				for (col = 0; col < COL; col++)
				{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							jz[row][col] = Integer.parseInt(tempVar4);
						}
				}
			}
				y = 0;
				for (row = 0; row < ROW; row++)
				{
						y += jz[row][0];

				}
				for (row = 0; row < ROW; row++)
				{
						y += jz[row][COL - 1];
				}

				for (col = 0; col < COL; col++)
				{
						y += jz[0][col];
				}
				for (col = 0; col < COL; col++)
				{
						y += jz[ROW - 1][col];
				}

				h[i] = y - jz[0][0] - jz[0][COL - 1] - jz[ROW - 1][0] - jz[ROW - 1][COL - 1];
		}
		for (i = 0;i < k;i++)
		{
				System.out.printf("%d\n",h[i]);

		}
		return 0;
	}
}

