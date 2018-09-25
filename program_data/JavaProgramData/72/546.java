package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int m;
		 int n;
		 int[][] sz = new int[ROW][COL];
		 int row;
		 int col;
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
		for (row = 0;row < m;row++)
		{
			for (col = 0;col < n;col++)
			{
				if (row == 0 && col == 0)
				{
					if (sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col + 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row == 0 && col == n - 1)
				{
					if (sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row == m - 1 && col == 0)
				{
					if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col + 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row == m - 1 && col == n - 1)
				{
					if (sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row - 1][col])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row == 0)
				{
					if (sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row == m - 1)
				{
					if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (col == 0)
				{
					if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col + 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (col == n - 1)
				{
					if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row != 0 && row != m - 1 && col != 0 && col != n - 1)
				{
				if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1])
				{
					System.out.printf("%d %d\n",row,col);
				}
				}
			}
		}


		return 0;
	}
}

