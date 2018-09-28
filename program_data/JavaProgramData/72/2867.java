package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
	int[][] sz = new int[m][n];
	int row;
	int col;
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
	int[] a = new int[400];
	int[] b = new int[400];
	int i;
	i = 0;
	for (row = 0;row < m;row++)
	{
	  for (col = 0;col < n;col++)
	  {
		if (row == 0 && col == 0)
		{
		   if (sz[row][col] >= sz[row][col + 1] != 0 && sz[row][col] >= sz[row + 1][col])
		   {
					 a[i] = row;
					 b[i] = col;
					 i++;
		   }
		}
		else if (row == 0 && col == n - 1)
		{
			if (sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row + 1][col])
			{
					a[i] = row;
					 b[i] = col;
					 i++;
			}
		}
		else if (row == m - 1 && col == 0)
		{
			if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col + 1])
			{
					a[i] = row;
					 b[i] = col;
					 i++;
			}
		}
		else if (row == m - 1 && col == n - 1)
		{
			if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col - 1])
			{
				   a[i] = row;
					 b[i] = col;
					i++;
			}
		}
		else if (row == 0)
		{
			 if (sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1])
			 {
			   a[i] = row;
			   b[i] = col;
				i++;
			 }
		}
		else if (row == m - 1)
		{
			  if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1])
			  {
				 a[i] = row;
			   b[i] = col;
				 i++;
			  }
		}
		else if (col == 0)
		{
			  if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col + 1])
			  {
				 a[i] = row;
			   b[i] = col;
				i++;
			  }
		}
		 else if (col == n - 1)
		 {
			   if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1])
			   {
				a[i] = row;
			   b[i] = col;
				i++;
			   }
		 }
		 else if (sz[row][col] >= sz[row - 1][col] != 0 && sz[row][col] >= sz[row + 1][col] != 0 && sz[row][col] >= sz[row][col - 1] != 0 && sz[row][col] >= sz[row][col + 1])
		 {
		   a[i] = row;
		   b[i] = col;
		   i++;
		 }

	  }
	}
	int k;
	for (k = 0;k < i; k++)
	{
		  System.out.printf("%d %d\n",a[k],b[k]);
	}
	return 0;
	}
}

