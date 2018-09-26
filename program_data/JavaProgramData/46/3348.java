package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{0, 1},
			{1, 0},
			{0, -1},
			{-1, 0}
		};
		int i;
		int n;
		int m;
		int j;
		int p;
		int[][] map = new int[200][200];
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= n + 1;i++)
		{
		for (j = 0;j <= m + 1;j++)
		{
		map[i][j] = -1;
		}
		}
		for (i = 1;i <= n;i++)
		{
		for (j = 1;j <= m;j++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			map[i][j] = Integer.parseInt(tempVar3);
		}
		}
		}
		x = 1;
		y = 1;
		p = 0;
		System.out.printf("%d",map[1][1]);
		map[1][1] = -1;
		while (true)
		{
				if (map[x + a[p][0]][y + a[p][1]] != -1)
				{
												 x += a[p][0];
												 y += a[p][1];
												 System.out.printf("\n%d",map[x][y]);
												 map[x][y] = -1;
				}
				else
				{
					p = (p + 1) % 4;
					if (map[x + a[p][0]][y + a[p][1]] != -1)
					{
												 x += a[p][0];
												 y += a[p][1];
												 System.out.printf("\n%d",map[x][y]);
												 map[x][y] = -1;
					}
				else
				{
				break;
				}
				}
		}
		//getch();
		return 0;
	}

}

