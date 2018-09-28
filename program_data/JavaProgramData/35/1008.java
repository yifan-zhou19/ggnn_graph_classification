package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int i;
		int k;
		int row;
		char a;
		int ROW;
		int COL;
		int m = 0;
		int n = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			COL = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < ROW;i++)
		{
			for (k = 0;k < COL;k++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar4);
				}
			}
		}
		for (row = 0;row < ROW;row++)
		{
			for (k = 0;k < COL;k++)
			{


				if (sz[row][m] < sz[row][k])
				{
				   m = k;
				}
			}
				for (i = 0;i < ROW;i++)
				{
					if (sz[n][m] > sz[i][m])
					{
						n = i;
					}
				}
					if (row == n)
					{
						System.out.printf("%d+%d",row,m);
						j++;
					}
		}
		if (j == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}

}

