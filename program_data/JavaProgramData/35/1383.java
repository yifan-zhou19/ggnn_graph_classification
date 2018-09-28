package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] map = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(map[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}

		int[][] p = new int[8][8];
		for (i = 0; i < m; i++)
		{
			for (j = 0; j < n; j++)
			{
				p[i][j] = 0;
			}
		}

		for (i = 0; i < m; i++)
		{
			int max_j;
			max_j = 0;
			for (j = 1; j < n; j++)
			{
				if (map[i][j] > map[i][max_j])
				{
					max_j = j;
				}
			}
			p[i][max_j] = 1;
		}

		int isAndian = 0;
		for (j = 0; j < n; j++)
		{
			int min_i;
			min_i = 0;
			for (i = 1; i < m; i++)
			{
				if (map[i][j] < map[min_i][j])
				{
					min_i = i;
				}
			}
			if (p[min_i][j] == 1)
			{
				System.out.printf("%d+%d\n",min_i,j);
				isAndian = 1;
				break;
			}
		}

		if (isAndian == 0)
		{
			System.out.print("No\n");
		}

		return 0;
	}

}

