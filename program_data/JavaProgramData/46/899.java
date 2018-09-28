package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int row;
		int col;
		int i;
		int j;
		int rowsx;
		int rowxx;
		int colsx;
		int colxx;
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
		rowsx = row - 1;
		rowxx = 0;
		colsx = col - 1;
		colxx = 0;
		while (rowsx > rowxx && colsx > colxx)
		{
			for (j = colxx; j < colsx;j++)
			{
				 System.out.printf("%d\n",a[rowxx][j]);
			}
		   for (i = rowxx; i < rowsx;i++)
		   {
				 System.out.printf("%d\n",a[i][colsx]);
		   }
		   for (j = colsx; j > colxx;j--)
		   {
				 System.out.printf("%d\n",a[rowsx][j]);
		   }
		   for (i = rowsx; i > rowxx;i--)
		   {
				 System.out.printf("%d\n",a[i][colxx]);
		   }
		   rowsx--;
		   rowxx++;
		   colsx--;
		   colxx++;
		}

		if (row % 2 == 1 || col % 2 == 1)
		{
			if (rowxx == rowsx)
			{
				for (j = colxx; j <= colsx;j++)
				{
				 System.out.printf("%d\n",a[rowxx][j]);
				}
			}
			else
			{
				for (i = rowxx; i <= rowsx;i++)
				{
				 System.out.printf("%d\n",a[i][colsx]);
				}
			}
		}

	return 0;
	}

}

