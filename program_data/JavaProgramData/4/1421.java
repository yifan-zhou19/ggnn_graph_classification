package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int row;
		int col;
		int n;
		int[][] sz = new int[100][100];
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
		if (row > col)
		{
		for (n = 0;n < col;n++)
		{
			for (i = 0;i < col;i++)
			{
				if (n - i > 0 || n - i == 0)
				{
				System.out.printf("%d\n",sz[i][n - i]);
				}
			}
		}
		for (n = col;n < col + row - 1;n++)
		{
			for (j = col - 1;j >= 0;j--)
			{
				if (n - j < row)
				{
					System.out.printf("%d\n",sz[n - j][j]);
				}
			}
		}
		}
		else
		{
		for (n = 0;n < col;n++)
		{
			for (i = 0;i < row;i++)
			{
				if (n - i > 0 || n - i == 0)
				{
				System.out.printf("%d\n",sz[i][n - i]);
				}
			}
		}
		for (n = col;n < col + row - 1;n++)
		{
			for (j = col - 1;n - j < row;j--)
			{
					System.out.printf("%d\n",sz[n - j][j]);
			}
		}
		}

		return 0;
	}


}

