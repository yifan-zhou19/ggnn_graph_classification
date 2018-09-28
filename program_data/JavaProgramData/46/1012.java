package <missing>;

public class GlobalMembers
{
	public static int[][] dir =
	{
		{0, 1},
		{1, 0},
		{0, -1},
		{-1, 0}
	};
	public static int k;
	public static int row;
	public static int col;
	public static int[][] a = new int[200][200];

	public static int Main()
	{
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
		for (int i = 0;i < row;++i)
		{
			for (int j = 0;j < col;++j)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int k = 0;
		int i = 0;
		int j = 0;
		int i1;
		int j1;
		while (1 > 0)
		{
			System.out.printf("%d\n",a[i][j]);
			a[i][j] = -1;
			i1 = i + dir[k][0];
			j1 = j + dir[k][1];
			if (i1 >= 0 && i1 < row && j1 >= 0 && j1 < col && a[i1][j1] != -1)
			{
				i = i1;
				j = j1;
				continue;
			}
			k = (k + 1) % 4;
			i1 = i + dir[k][0];
			j1 = j + dir[k][1];
			if (i1 >= 0 && i1 < row && j1 >= 0 && j1 < col && a[i1][j1] != -1)
			{
				i = i1;
				j = j1;
				continue;
			}
			break;
		}
	}

}

