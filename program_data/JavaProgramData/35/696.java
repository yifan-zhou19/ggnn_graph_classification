package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int[] max = new int[8];
		int[] min = new int[8];
		int i;
		int j;
		int x = 0;
		int row;
		int col;
		int t = 0;
		int y;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
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
			scanf("\n");
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col - 1;j++)
			{
				if (sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= t)
				{
					 t = sz[i][j];
					 max[i] = j;
				}
				if (sz[i][j + 1] > sz[i][j] && sz[i][j + 1] >= t)
				{
					 t = sz[i][j + 1];
					 max[i] = j + 1;
				}
			}
			t = 0;
		}
		for (i = 0;i < col;i++)
		{
			m = sz[0][i];
			for (j = 0;j < row - 1;j++)
			{
				if (sz[j][i] <= sz[j + 1][i] != 0 && sz[j][i] <= m)
				{
					 m = sz[j][i];
					 min[i] = j;
				}
				if (sz[j + 1][i] < sz[j][i] && sz[j + 1][i] <= m)
				{
					m = sz[j + 1][i];
					min[i] = j + 1;
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			y = max[i];
			if (min[y] == i)
			{
				System.out.printf("%d+%d",i,y);
			}
			else
			{
				x += 1;
			}
		}
		if (x == row)
		{
			System.out.print("No");
		}
		return 0;
	}

}

