package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int row;
		int col;
		int[][] a = new int[100][100];
		int i;
		int j;
		int p;
		int q;
		int k;
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
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (row < col)
		{
			q = row;
		}
		else
		{
			q = col;
		}
		p = (q + 1) / 2;
		if (row == col || q % 2 == 0)
		{
			for (k = 0;k < p;k++)
			{
			for (j = k;j < col - k;j++)
			{
				System.out.printf("%d\n",a[k][j]);
			}
			for (i = k + 1;i < row - k;i++)
			{
				System.out.printf("%d\n",a[i][col - 1 - k]);
			}
			for (j = col - 2 - k;j >= k;j--)
			{
				System.out.printf("%d\n",a[row - 1 - k][j]);
			}
			for (i = row - 2 - k;i > k;i--)
			{
				System.out.printf("%d\n",a[i][k]);
			}
			}
		}
		if (row != col && q % 2 != 0)
		{
			if (col > row)
			{
				if (q == 1)
				{
					for (j = 0;j < col;j++)
					{
						System.out.printf("%d\n",a[0][j]);
					}
				}
				else
				{
					for (k = 0;k < p - 1;k++)
					{
					  for (j = k;j < col - k;j++)
					  {
						System.out.printf("%d\n",a[k][j]);
					  }
					  for (i = k + 1;i < row - k;i++)
					  {
						System.out.printf("%d\n",a[i][col - 1 - k]);
					  }
					  for (j = col - 2 - k;j >= k;j--)
					  {
						System.out.printf("%d\n",a[row - 1 - k][j]);
					  }
					  for (i = row - 2 - k;i > k;i--)
					  {
						System.out.printf("%d\n",a[i][k]);
					  }
					}
					for (j = p - 1;j < col - p + 1;j++)
					{
						System.out.printf("%d\n",a[p - 1][j]);
					}
				}
			}
			if (row > col)
			{
				if (q == 1)
				{
					for (i = 0;i < row;i++)
					{
						System.out.printf("%d\n",a[i][0]);
					}
				}
				else
				{
					for (k = 0;k < p - 1;k++)
					{
					  for (j = k;j < col - k;j++)
					  {
						System.out.printf("%d\n",a[k][j]);
					  }
					  for (i = k + 1;i < row - k;i++)
					  {
						System.out.printf("%d\n",a[i][col - 1 - k]);
					  }
					  for (j = col - 2 - k;j >= k;j--)
					  {
						System.out.printf("%d\n",a[row - 1 - k][j]);
					  }
					  for (i = row - 2 - k;i > k;i--)
					  {
						System.out.printf("%d\n",a[i][k]);
					  }
					}
					for (j = p - 1;j < row - p + 1;j++)
					{
						System.out.printf("%d\n",a[j][p - 1]);
					}
				}
			}
		}
	}






}

