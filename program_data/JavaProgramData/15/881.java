package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] sz = new int[ROW][COL];
		int x1;
		int y1;
		int x2;
		int y2;
		for (int row = 1;row <= n;row++)
		{
			for (int col = 1;col <= n;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int row = 1;row <= n;row++)
		{
			for (int col = 1;col <= n;col++)
			{
				if (sz[row][col] == 0)
				{
					x1 = row;
					y1 = col;
				}
			}
		}
		for (int row = n;row > 0;row--)
		{
			for (int col = n;col > 0;col--)
			{
				if (sz[row][col] == 0)
				{
					x2 = row;
					y2 = col;
				}
			}
		}
		int s;
		s = (x2 - x1 + 1) * (y2 - y1 + 1);
		System.out.printf("%d",s);
		return 0;
	}
}

