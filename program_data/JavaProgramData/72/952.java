package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int row;
		int col;
		int[][] sz = new int[20][20];

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
				if (row == 0)
				{
					if (col == 0 && sz[0][0] >= sz[0][1] != 0 && sz[0][0] >= sz[1][0])
					{
						System.out.printf("%d %d\n",row,col);
					}
					else if (col == n - 1 && sz[0][n - 1] >= sz[0][n - 2] != 0 && sz[0][n - 1] >= sz[1][n - 1])
					{
						System.out.printf("%d %d\n",row,col);
					}
					else if (sz[0][col] >= sz[0][col - 1] != 0 && sz[0][col] >= sz[0][col + 1] != 0 && sz[0][col] >= sz[1][col])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (col == 0)
				{
					if (row == n - 1 && sz[row][col] >= sz[row][col + 1] != 0 && sz[row][col] >= sz[row - 1][col])
					{
						System.out.printf("%d %d\n",row,col);
					}
					else if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col + 1] != 0 && sz[row][col] >= sz[row + 1][col])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (row == m - 1)
				{
					if (col == n - 1 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row - 1][col])
					{
						System.out.printf("%d %d\n",row,col);
					}
					else if (sz[row][col] >= sz[row][col + 1] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row - 1][col])
					{
						System.out.printf("%d %d\n",row,col);
					}
				}
				else if (col == n - 1 && sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row + 1][col])
				{
					System.out.printf("%d %d\n",row,col);
				}
				else if (sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1] != 0 && sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col])
				{
						System.out.printf("%d %d\n",row,col);
				}

			}
		}


		return 0;
	}

}

