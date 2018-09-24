package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[N][N];
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int sx = 0;
		int xx = row - 1;
		int zx = 0;
		int yx = col - 1;
		while ((sx < xx) && (zx < yx))
		{
			for (j = zx;j < yx;j++)
			{
			   System.out.printf("%d\n",sz[sx][j]);
			}
			for (j = sx;j < xx;j++)
			{
			   System.out.printf("%d\n",sz[j][yx]);
			}
			for (j = yx;j > zx;j--)
			{
			   System.out.printf("%d\n",sz[xx][j]);
			}
			for (j = xx;j > sx;j--)
			{
			   System.out.printf("%d\n",sz[j][zx]);
			}
			sx++;
			;
			xx--;
			zx++;
			yx--;
		}
		if ((sx == xx) && (zx == yx))
		{
			System.out.printf("%d\n",sz[sx][zx]);
		}
		if ((sx == xx) && (zx < yx))
		{
			for (i = zx;i <= yx;i++)
			{
				System.out.printf("%d\n",sz[sx][i]);
			}
		}
		if ((sx < xx) && (zx == yx))
		{
			for (i = sx;i <= xx;i++)
			{
				System.out.printf("%d\n",sz[i][zx]);
			}
		}
		return 0;
	}

}

