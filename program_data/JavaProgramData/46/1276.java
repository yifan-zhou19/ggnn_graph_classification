package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int col;
		int row;
		int[][] sz = new int[100][100];
		int i;
		int j;
		int m = 0;
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (col <= row)
		{
		 for (k = 1;2 * k < col + 1;k++)
		 {
			   for (j = k - 1;j < col - k;j++)
			   {
					 System.out.printf("%d\n",sz[k - 1][j]);
					 m++;
			   }
			   for (i = k - 1;i < row - k;i++)
			   {
					 System.out.printf("%d\n",sz[i][col - k]);
					 m++;
			   }
			   for (j = col - k;j > k - 1;j--)
			   {
					 System.out.printf("%d\n",sz[row - k][j]);
					 m++;
			   }
			   for (i = row - k;i > k - 1;i--)
			   {
					   System.out.printf("%d\n",sz[i][k - 1]);
					m++;
			   }
		 }
		 for (i = k - 1;i < row,m < row * col;i++,m++)
		 {
			 System.out.printf("%d\n",sz[i][k - 1]);
		 }
		}
		else
		{
		   for (k = 1;2 * k < row + 1;k++)
		   {
			   for (j = k - 1;j < col - k;j++)
			   {
					 System.out.printf("%d\n",sz[k - 1][j]);
					 m++;
			   }
			   for (i = k - 1;i < row - k;i++)
			   {
					 System.out.printf("%d\n",sz[i][col - k]);
					 m++;
			   }
			   for (j = col - k;j > k - 1;j--)
			   {
					 System.out.printf("%d\n",sz[row - k][j]);
					 m++;
			   }
			   for (i = row - k;i > k - 1;i--)
			   {
					   System.out.printf("%d\n",sz[i][k - 1]);
					m++;
			   }
		   }
		   for (j = k - 1;j < col - k,m < row * col;j++,m++)
		   {
				  System.out.printf("%d\n",sz[k - 1][j]);
		   }
		}
		return 0;
	}
}

