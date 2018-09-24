package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[ROW][COL];
		int s = 0;
		int m;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (int t = 1;t <= k;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (int q = 0;q < m;q++)
			{
				for (int p = 0;p < n;p++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[q][p] = Integer.parseInt(tempVar4);
					}
				}
			}
			int col = 0;
			int row = 0;
			for (col;col < n;col++)
			{
				s = s + a[row][col];
			}
			col = 0;
			for (row;row < m;row++)
			{
				s = s + a[row][col];
			}
			row = m - 1;
			col = 0;
			for (col;col < n;col++)
			{
				s = s + a[row][col];
			}
			col = n - 1;
			row = 0;
			for (row;row < m;row++)
			{
				s = s + a[row][col];
			}
			s = s - a[0][0] - a[m - 1][n - 1] - a[0][n - 1] - a[m - 1][0];
			System.out.printf("%d\n",s);
			s = 0;
		}
		return 0;
	}
}

