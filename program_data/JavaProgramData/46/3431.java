package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int x = 0;
		int y = 0;
		int row;
		int col;
		int k = 0;
		int[][] a = new int[100][100];
		int[] dx = {0, 1, 0, -1};
		int[] dy = {1, 0, -1, 0};
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row * col;i++)
		{
			System.out.printf("%d\n",a[x][y]);
			if (k == 0 && x + y == col - 1)
			{
				k = 1;
			}
			else if (k == 1 && x - y == row - col)
			{
				k = 2;
			}
			else if (k == 2 && x + y == row - 1)
			{
				k = 3;
			}
			else if (k == 3 && x - y == 1)
			{
				k = 0;
			}
			x += dx[k];
			y += dy[k];
		}
		return 0;
	}
}

