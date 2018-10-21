package <missing>;

public class GlobalMembers
{
	// for each point x, if x has a higher neighbor, set x = -1
	// set an extra wall to reduce times of comparison


	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;

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
		int[][] block = new int[m + 2][n + 2];
		int[][] mark = new int[m + 2][n + 2];
		//initialize the wall
		for (i = 0; i < n + 2; i++)
		{
			block[0][i] = -1;
			block[m + 1][i] = -1;
		}
		for (i = 1; i < m + 1; i++)
		{
			block[i][0] = -1;
			block[i][n + 1] = -1;
		}
		//read blocks
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					block[i][j] = Integer.parseInt(tempVar3);
				}
				mark[i][j] = 0;
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (mark[i][j] != -1)
				{
								if (block[i][j] < block[i][j + 1])
								{
												mark[i][j] = -1;
												continue;
								}
								else if (block[i][j] > block[i][j + 1])
								{
									 mark[i][j + 1] = -1;
								}
								if (block[i][j] < block[i + 1][j])
								{
												mark[i][j] = -1;
												continue;
								}
								else if (block[i][j] > block[i + 1][j])
								{
									 mark[i + 1][j] = -1;
								}
								if (block[i][j] < block[i - 1][j])
								{
												mark[i][j] = -1;
												continue;
								}
								else if (block[i][j] > block[i - 1][j])
								{
									 mark[i - 1][j] = -1;
								}
								if (block[i][j] < block[i][j - 1])
								{
												mark[i][j] = -1;
												continue;
								}
								else if (block[i][j] > block[i][j - 1])
								{
									 mark[i][j - 1] = -1;
								}
								System.out.printf("%i %i\n", i - 1, j - 1);
				}
			}
		}

		return 0;
	}

}

