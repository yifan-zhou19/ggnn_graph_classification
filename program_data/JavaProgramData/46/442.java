package <missing>;

public class GlobalMembers
{
	public static int[][] dat = new int[102][102];
	public static _Bool[][] use = new _Bool[102][102];
	public static int[][] dir =
	{
		{0, 1},
		{1, 0},
		{0, -1},
		{-1, 0}
	};
	public static int Main()
	{
		int n;
		int m;
		int l1;
		int l2;
		int i;
		int j;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (l1 = 1;l1 <= m;l1++)
		{
			for (l2 = 1;l2 <= n;l2++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					dat[l1][l2] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (l1 = 1;l1 <= m;l1++)
		{
			use[l1][0] = use[l1][n + 1] = 1;
		}
		for (l1 = 1;l1 <= n;l1++)
		{
			use[0][l1] = use[m + 1][l1] = 1;
		}
		i = 1;
		j = 1;
		d = 0;
		while (true)
		{
			System.out.printf("%d\n",dat[i][j]);
			use[i][j] = 1;
			for (l1 = 1;l1 <= 4;l1++)
			{
				if (use[i + dir[d][0]][j + dir[d][1]] == 1)
				{
					d = (d + 1) % 4;
				}
				else
				{
						i += dir[d][0];
						j += dir[d][1];
						break;
				}
			}
			if (l1 == 5)
			{
				break;
			}
		}
		return 0;
	}

}

