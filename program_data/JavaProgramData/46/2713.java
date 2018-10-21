package <missing>;

public class GlobalMembers
{
	public static int[][] mat = new int[102][102];
	public static int[][] unvis = new int[102][102];

	public static int Main()
	{
		int n;
		int r;
		int c;
		int i;
		int j;
		int d;
		int[][] dir =
		{
			{0, 1},
			{1, 0},
			{0, -1},
			{-1, 0}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r ;i++)
		{
			for (j = 0; j < c; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					mat[i][j] = Integer.parseInt(tempVar3);
				}
				unvis[i][j] = 1;
			}
		}
		n = r * c;
		r = 0;
		c = 0;
		d = 0;
		while (n != 0)
		{
			unvis[r][c] = 0;
			System.out.printf("%d\n",mat[r][c]);
			i = r + dir[d][0];
			j = c + dir[d][1];
			if (i >= 0 && j >= 0 && unvis[i][j] != 0)
			{
				r = i;
				c = j;
			}
			else
			{
				d = (d + 1) % 4;
				r = r + dir[d][0];
				c = c + dir[d][1];
			}
			n--;
		}

		return 0;
	}
}

