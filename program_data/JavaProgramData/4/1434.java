package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int ROW;
		int COL;
		int i = 0;
		int k = 0;
		int j = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				ROW = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				COL = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < ROW;i++)
			{
				for (j = 0;j < COL;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						array[i][j] = Integer.parseInt(tempVar3);
					}
				}
			}
		for (k = 0; k < COL; k++)
		{
			for (i = 0, j = k; i < ROW && j >= 0; i++, j--)
			{
				System.out.printf("%d\n",array[i][j]);
			}
		}
	for (k = 1; k < ROW; k++)
	{
		for (i = k, j = COL - 1; i < ROW && j >= 0; i++, j--)
		{
	System.out.printf("%d\n",array[i][j]);
		}
	}
		return 0;
	}
}

