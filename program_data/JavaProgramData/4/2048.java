package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int i;
		int j;
		int n;
		int m;
		int e;
		int cishu;
		int[][] sz = new int[100][100];
		e = 0;
		n = 0;
		cishu = 0;
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
		for (j = 0;j < row;j++)
		{
			for (i = 0;i < col;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row > 1 && col > 1)
		{
			for (i = 0,j = 0;;i++,j--)
			{
				if (i == 0)
				{
					m = j;
				}
				System.out.printf("%d\n",sz[i][j]);
				 cishu++;
				if (cishu == row * col)
				{
					break;
				}
				if ((j == 0 || i == row - 1) && e == 0)
				{
					i = -1;
					j = m + 2;
					if (j == col)
					{
						e = 1;
					}
				}
				if ((j == 0 || i == row - 1) && e == 1)
				{
					j = col;
					n++;
					i = n - 1;
				}
			}
		}
		else
		{
			for (j = 0;j < row;j++)
			{
				for (i = 0;i < col;i++)
				{
					System.out.printf("%d\n",sz[j][i]);
				}
			}
		}
		return 0;
	}
}

