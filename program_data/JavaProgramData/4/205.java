package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[][] sz = new int[101][101];
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

		if (row > col)
		{
			int x;
			for (j = 0;j < col;j++)
			{
				for (x = 0;x <= j;x++)
				{ //?x++??k++!!!//
					System.out.printf("%d\n",sz[x][j - x]);
				}
			}
			int y;
			for (i = 1;i <= row - col;i++)
			{
				for (y = 0;y < col;y++)
				{
					System.out.printf("%d\n",sz[i + y][col - y - 1]);
				}
			}
			int w;
			for (i = row - col + 1;i < row;i++)
			{
				for (w = 0;w < col - 1;w++)
				{
					System.out.printf("%d\n",sz[i + w][col - w - 1]);
					if (i + w == row - 1)
					{
						break;
					}
				}
			}
		}
		else
		{
			int z;
			for (j = 0;j < row;j++)
			{
				for (z = 0;z <= j;z++)
				{
					System.out.printf("%d\n",sz[z][j - z]);
				}
			}
			int n;
			for (j = row;j < col;j++)
			{
				for (n = 0;n < row;n++)
				{
					System.out.printf("%d\n",sz[n][j - n]);
				}
			}
			int m;
			for (i = 1;i < row;i++)
			{
				for (m = 0;m < row - 1;m++)
				{
					System.out.printf("%d\n",sz[i + m][col - m - 1]);
					if (i + m == row - 1)
					{
						break;
					}
				}
			}
		}

		return 0;
	}


}

