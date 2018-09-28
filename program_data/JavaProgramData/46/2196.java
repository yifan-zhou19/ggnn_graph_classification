package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int m;
		int n;
		int[][] sz = new int[105][105];
		int[][] e = new int[105][105];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < m;row++)
		{
			for (col = 0;col < n;col++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar3);
				}
			}
		}
		while (m > 0 && n > 0)
		{
			if (m > 1 && n > 1)
			{
				for (col = 0;col < n;col++)
				{
					System.out.printf("%d\n",sz[0][col]);
				}
				for (row = 1;row < m;row++)
				{
					System.out.printf("%d\n",sz[row][n - 1]);
				}
				for (col = n - 2;col >= 0;col--)
				{
					System.out.printf("%d\n",sz[m - 1][col]);
				}
				for (row = m - 2;row >= 1;row--)
				{
					System.out.printf("%d\n",sz[row][0]);
				}
				for (row = 0;row < m;row++)
				{
					for (col = 0;col < n;col++)
					{
						e[row][col] = sz[row][col];
					}
				}
			}
			else if (m == 1)
			{
				for (col = 0;col < n;col++)
				{
					System.out.printf("%d\n",sz[0][col]);
				}
			}
			else
			{
				for (row = 0;row < m;row++)
				{
					System.out.printf("%d\n",sz[row][0]);
				}
			}
			m -= 2;
			n -= 2;
			for (row = 0;row < m;row++)
			{
				for (col = 0;col < n;col++)
				{
					sz[row][col] = e[row + 1][col + 1];
				}
			}
		}
		return 0;
	}
}

