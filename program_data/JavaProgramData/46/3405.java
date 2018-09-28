package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int j;
		int k;
		int l;
		int x;
		int p;
		int r;
		int q;
		int a;
		int b = 1;
		int[][] sz = new int[100][100];
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
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row >= col)
		{
			if (col % 2 == 0)
			{
			a = col / 2;
			for (k = 0;k < a;k++)
			{

					for (l = k;l < (col - 1 - k);l++)
					{
						System.out.printf("%d\n",sz[k][l]);
					}

					for (p = k;p < (row - 1 - k);p++)
					{
						System.out.printf("%d\n",sz[p][col - k - 1]);
					}

					for (q = (col - k - 1);q > k;q--)
					{
						System.out.printf("%d\n",sz[row - k - 1][q]);
					}

					for (r = (row - k - 1);r > k;r--)
					{
						System.out.printf("%d\n",sz[r][k]);
					}
			}

			}
			else
			{
			a = col / 2;
			for (k = 0;k < a;k++)
			{

					for (l = k;l < (col - 1 - k);l++)
					{
						System.out.printf("%d\n",sz[k][l]);
					}

					for (p = k;p < (row - 1 - k);p++)
					{
						System.out.printf("%d\n",sz[p][col - k - 1]);
					}

					for (q = (col - k - 1);q > k;q--)
					{
						System.out.printf("%d\n",sz[row - k - 1][q]);
					}

					for (r = (row - k - 1);r > k;r--)
					{
						System.out.printf("%d\n",sz[r][k]);
					}
			}
			   for (x = a;x < (row - a);x++)
			   {
						System.out.printf("%d\n",sz[x][a]);
			   }
			}


		}



		else
		{
			if (row % 2 == 0)
			{
			a = row / 2;
			for (k = 0;k < a;k++)
			{

					for (l = k;l < (col - 1 - k);l++)
					{
						System.out.printf("%d\n",sz[k][l]);
					}

					for (p = k;p < (row - 1 - k);p++)
					{
						System.out.printf("%d\n",sz[p][col - k - 1]);
					}

					for (q = (col - k - 1);q > k;q--)
					{
						System.out.printf("%d\n",sz[row - k - 1][q]);
					}

					for (r = (row - k - 1);r > k;r--)
					{
						System.out.printf("%d\n",sz[r][k]);
					}
			}

			}
			else
			{
			a = row / 2;
			for (k = 0;k < a;k++)
			{

					for (l = k;l < (col - 1 - k);l++)
					{
						System.out.printf("%d\n",sz[k][l]);
					}

					for (p = k;p < (row - 1 - k);p++)
					{
						System.out.printf("%d\n",sz[p][col - k - 1]);
					}

					for (q = (col - k - 1);q > k;q--)
					{
						System.out.printf("%d\n",sz[row - k - 1][q]);
					}

					for (r = (row - k - 1);r > k;r--)
					{
						System.out.printf("%d\n",sz[r][k]);
					}
			}
			   for (x = a;x < (col - a);x++)
			   {
						System.out.printf("%d\n",sz[a][x]);
			   }
			}


		}




		return 0;
	}



}

