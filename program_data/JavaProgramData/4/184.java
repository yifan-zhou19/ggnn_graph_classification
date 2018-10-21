package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int col;
		int row;
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
		if (col >= row)
		{
		  for (k = 0;k < col;k++)
		  {
			  for (l = 0;l < row && l <= k;l++)
			  {
				  System.out.printf("%d\n",a[l][k - l]);
			  }
		  }
		  for (m = 1;m < row;m++)
		  {
			  for (n = 0;n < row - m;n++)
			  {
				  System.out.printf("%d\n",a[m + n][col - 1 - n]);
			  }
		  }
		}
		else
		{
			for (k = 0;k < col;k++)
			{
			  for (l = 0;l < row && l <= k;l++)
			  {
				  System.out.printf("%d\n",a[l][k - l]);
			  }
			}
			for (m = 1;m < row;m++)
			{
				for (n = 0;n < row - m && n < col;n++)
				{
					System.out.printf("%d\n",a[m + n][col - 1 - n]);
				}
			}
		}
	}
}

