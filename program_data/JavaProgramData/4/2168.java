package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
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
		int[][] array = new int[row][col];
		int i;
		int j;
		int k;
		for (i = 0;i < row;i++)
		{
						   for (j = 0;j < col;j++)
						   {
											  String tempVar3 = ConsoleInput.scanfRead();
											  if (tempVar3 != null)
											  {
												  array[i][j] = Integer.parseInt(tempVar3);
											  }
						   }
		}
		for (i = 0;i < col;i++)
		{
						   for (j = i, k = 0;k < row && j>-1;j--, k++)
						   {
													 System.out.printf("%d\n",array[k][j]);
						   }
		}
		for (i = 1;i < row;i++)
		{
						   for (j = i, k = col - 1;j < row && k>-1;j++, k--)
						   {
														  System.out.printf("%d\n",array[j][k]);
						   }
		}
		return 0;
	}

}

