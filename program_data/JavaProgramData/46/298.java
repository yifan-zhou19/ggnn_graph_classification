package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] sz = new int[100][100];
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
		for (k = 0;k < (col + 1) / 2;k++)
		{
			for (i = k,j = k;j < col - k;j++)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			if (2 * k == row - 1)
			{
				break;
			}
			for (i = k + 1,j = col - k - 1;i < row - k;i++)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			if (2 * k == col - 1)
			{
				break;
			}
			for (i = row - k - 1,j = col - k - 2;j >= k;j--)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			if (2 * k == row - 2)
			{
				break;
			}
			for (j = k,i = row - k - 2;i > k;i--)
			{
				System.out.printf("%d\n",sz[i][j]);
			}
			if (2 * k == col - 2)
			{
				break;
			}
		}
		return 0;
	}

}

