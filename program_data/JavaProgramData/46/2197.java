package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int j;
	int k;
	int[][] sz = new int[h][h];
	int max;
	int row;
	int col;
	int e;
	int t;
	int m;
	int l;
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
		  for (i = 1;i <= row;i++)
		  {
			  for (j = 1;j <= col;j++)
			  {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   sz[i][j] = Integer.parseInt(tempVar3);
			   }
			  }
		  }
		  if (row == 1 || col == 1)
		  {
			  for (i = 1;i <= row;i++)
			  {
			  for (j = 1;j <= col;j++)
			  {
			   System.out.printf("%d\n",sz[i][j]);
			  }
			  }
		  }
		  else
		  {
			   if (row % 2 != 0 && col % 2 != 0)
			   {
				   if (col > row)
				   {
			t = (row + 1) / 2;
				   }
				   else if (row >= col)
				   {
				   t = (col + 1) / 2;
				   }
				   max = t;
			   }
			   else
			   {
		if (col > row)
		{
			   e = row / 2;
		}
		else if (row >= col)
		{
			e = col / 2;
		}
		max = e;
			   }
	for (k = 1;k <= max;k++)
	{
	for (j = k;j <= col - k;j++)
	{
	System.out.printf("%d\n",sz[k][j]);
	}
	for (i = k;i <= row - k;i++)
	{
	System.out.printf("%d\n",sz[i][col - k + 1]);
	}
	for (j = col - k + 1;j >= k + 1;j--)
	{
	System.out.printf("%d\n",sz[row + 1 - k][j]);
	}
	for (i = row - k + 1;i >= k + 1;i--)
	{
	System.out.printf("%d\n",sz[i][k]);
	}

	m = k;
	}
	if (row % 2 != 0 && col % 2 == 0)
	{
	for (l = m + 1;l <= (col - m);l++)
	{
		System.out.printf("%d\n",sz[(row + 1) / 2][l]);
	}
	}
	else if (row % 2 == 0 && col % 2 != 0)
	{
	for (l = m + 1;l <= (row - m);l++)
	{
		System.out.printf("%d\n",sz[l][(col + 1) / 2]);
	}
	}
	 else if (row % 2 != 0 && col % 2 != 0)
	 {


	System.out.printf("%d\n",sz[(row + 1) / 2][(col + 1) / 2]);
	 }


		  }
	return 0;



	}
}

