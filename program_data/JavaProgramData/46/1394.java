package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int i;
		int j;
		int row;
		int k;
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
		for (i = 0;i < row - 1 - i && i < col - 1 - i;i++)
		{
			for (j = i;j < col - 1 - i;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			for (j = i;j < row - 1 - i;j++)
			{
				System.out.printf("%d\n",sz[j][col - 1 - i]);
			}
			for (j = col - 1 - i;j > i;j--)
			{
				System.out.printf("%d\n",sz[row - 1 - i][j]);
			}
			for (j = row - 1 - i;j > i;j--)
			{
				System.out.printf("%d\n",sz[j][i]);
			}
		}
		if (i == row - i - 1 && i == col - i - 1)
		{
			System.out.printf("%d\n",sz[i][i]);
		}
		if (i == row - 1 - i && i < col - i - 1)
		{
			for (k = i;k < col - i;k++)
			{
				System.out.printf("%d\n",sz[i][k]);
			}
		}
		if (i < row - 1 - i && i == col - 1 - i)
		{
			for (k = i;k < row - i;k++)
			{
				System.out.printf("%d\n",sz[k][i]);
			}
		}
		return 0;
	}
}

