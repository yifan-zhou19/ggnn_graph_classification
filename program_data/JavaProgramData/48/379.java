package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int row;
		 int col;
		 int i;
		 int[][] sz = new int[11][11];
		 int[][] by = new int[11][11];
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
		 for (row = 1;row <= 9;row++)
		 {
				for (col = 1;col <= 9;col++)
				{
					sz[row][col] = 0;
					by[row][col] = 0;
				}
		 }
		sz[5][5] = m;
		by[5][5] = m;
		for (i = 1;i <= n;i++)
		{
		for (row = 1;row <= 9;row++)
		{
			for (col = 1;col <= 9;col++)
			{
				if (sz[row][col] != 0)
				{
					by[row][col] = sz[row][col] + by[row][col];
					by[row - 1][col] += sz[row][col];
					by[row - 1][col - 1] += sz[row][col];
					by[row - 1][col + 1] += sz[row][col];
					by[row][col - 1] += sz[row][col];
					by[row][col + 1] += sz[row][col];
					by[row + 1][col] += sz[row][col];
					by[row + 1][col - 1] += sz[row][col];
					by[row + 1][col + 1] += sz[row][col];
				}
			}
		}
		for (row = 1;row <= 9;row++)
		{
			for (col = 1;col <= 9;col++)
			{
				sz[row][col] = by[row][col];
			}
		}
		}
		for (row = 1;row <= 9;row++)
		{
			for (col = 1;col <= 9;col++)
			{
				if (col != 9)
				{
					System.out.printf("%d ",sz[row][col]);
				}
				else
				{
					System.out.printf("%d\n",sz[row][col]);
				}
			}
		}

		return 0;
	}
}

