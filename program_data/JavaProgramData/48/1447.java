package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[9][9];
		int[][] sj = new int[9][9];

		int a;
		int n;
		int row;
		int col;
		int r;
		int m;
		int x;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (row = 0;row < 9;row++)
		{
			for (col = 0;col < 9;col++)
			{
				sz[row][col] = 0;
				sj[row][col] = 0;
			}
		}
		sz[4][4] = a;


		for (row = 0;row < 9;row++)
		{
			for (col = 0;col < 9;col++)
			{
				sj[row][col] = sz[row][col];

			}
		}
		for (row = 0;row < 9;row++)
		{
			for (col = 0;col < 9;col++)
			{
				if (sz[row][col] != 0)
				{
					for (r = (row - 1);r <= (row + 1);r++)
					{
						for (m = (col - 1);m <= (col + 1);m++)
						{
							sj[r][m] += sz[row][col];
						}
					}
				}
			}
		}
		if (n == 1)
		{
			for (x = 0;x < 9;x++)
			{
				for (y = 0;y < 8;y++)
				{
					System.out.printf("%d ",sj[x][y]);
				}
				System.out.printf("%d\n",sj[x][y]);
			}

		}

			for (row = 0;row < 9;row++)
			{
			for (col = 0;col < 9;col++)
			{
				sz[row][col] = sj[row][col];

			}
			}
		for (row = 0;row < 9;row++)
		{
			for (col = 0;col < 9;col++)
			{

				if (sj[row][col] != 0)
				{
					for (r = row - 1;r <= row + 1;r++)
					{
						for (m = col - 1;m <= col + 1;m++)
						{
							sz[r][m] += sj[row][col];
						}
					}
				}
			}
		}
		if (n == 2)
		{
			for (x = 0;x < 9;x++)
			{
				for (y = 0;y < 8;y++)
				{
					System.out.printf("%d ",sz[x][y]);
				}
				System.out.printf("%d\n",sz[x][y]);
			}

		}


			for (row = 0;row < 9;row++)
			{
			for (col = 0;col < 9;col++)
			{
				sj[row][col] = sz[row][col];

			}
			}

			for (row = 0;row < 9;row++)
			{
			for (col = 0;col < 9;col++)
			{

				if (sz[row][col] != 0)
				{
					for (r = row - 1;r <= row + 1;r++)
					{
						for (m = col - 1;m <= col + 1;m++)
						{
							sj[r][m] += sz[row][col];
						}
					}
				}
			}
			}
		if (n == 3)
		{
			for (x = 0;x < 9;x++)
			{
				for (y = 0;y < 8;y++)
				{
					System.out.printf("%d ",sj[x][y]);
				}
				System.out.printf("%d\n",sj[x][y]);
			}

		}

			for (row = 0;row < 9;row++)
			{
			for (col = 0;col < 9;col++)
			{
				sz[row][col] = sj[row][col];

			}
			}


		for (row = 0;row < 9;row++)
		{
			for (col = 0;col < 9;col++)
			{

				if (sj[row][col] != 0)
				{
					for (r = row - 1;r <= row + 1;r++)
					{
						for (m = col - 1;m <= col + 1;m++)
						{
							sz[r][m] += sj[row][col];
						}
					}
				}
			}
		}
		if (n == 4)
		{
			for (x = 0;x < 9;x++)
			{
				for (y = 0;y < 8;y++)
				{
					System.out.printf("%d ",sz[x][y]);
				}
				System.out.printf("%d\n",sz[x][y]);
			}

		}

		return 0;
	}

}

