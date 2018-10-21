package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int i;
		int row;
		int col;
		int j;
		int k = 0;
		int min;
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
		min = row;
		if (row > col)
		{
			min = col;
		}
		while (k < (min + 1) / 2)
		{
			for (j = 0 + k;j < col - k;j++)
			{
				System.out.printf("%d\n",sz[0 + k][j]);
			}
			for (i = 1 + k;i < row - k;i++)
			{
				System.out.printf("%d\n",sz[i][col - 1 - k]);
			}
			for (j = col - 2 - k;j > -1 + k;j--)
			{
				if (row - 1 - k <= 0 + k)
				{
					break;
				}
				System.out.printf("%d\n",sz[row - 1 - k][j]);
			}
			for (i = row - 2 - k;i > k;i--)
			{
					if (k >= col - 1 - k)
					{
					break;
					}
				System.out.printf("%d\n",sz[i][k]);
			}
			k += 1;
		}

		return 0;
	}

}

