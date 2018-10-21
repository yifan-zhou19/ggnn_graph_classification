package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int row;
		int col;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < row;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead("\n");
			if (tempVar3 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar3);
			}
			for (j = 1;j < col;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		if (col >= row)
		{
		   for (i = 0;i < row;i++)
		   {
			   for (j = 0,k = i;j <= i;j++,k--)
			   {
				   System.out.printf("%d\n",sz[j][k]);
			   }
		   }
		   for (i = row;i < col;i++)
		   {
			   for (j = 0,k = i;j < row;j++,k--)
			   {
				   System.out.printf("%d\n",sz[j][k]);
			   }
		   }
		   for (i = 1;i < row;i++)
		   {
			   for (j = i,k = col - 1;j < row;j++,k--)
			   {
				   System.out.printf("%d\n",sz[j][k]);
			   }
		   }
		}
		if (col < row)
		{
		   for (i = 0;i < col;i++)
		   {
			   for (j = 0,k = i;j <= i;j++,k--)
			   {
				   System.out.printf("%d\n",sz[j][k]);
			   }
		   }
		   for (i = 1;i <= row - col;i++)
		   {
			   for (j = i,k = col - 1;k >= 0;j++,k--)
			   {
				   System.out.printf("%d\n",sz[j][k]);
			   }
		   }
		   for (i = row - col + 1;i < row;i++)
		   {
			   for (j = i,k = col - 1;j < row;j++,k--)
			   {
				   System.out.printf("%d\n",sz[j][k]);
			   }
		   }
		}
		return 0;
	}
}

