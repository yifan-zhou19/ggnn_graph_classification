package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int col;
		int row;
		int[][] sz = new int[99][99];
		int i;
		int j;
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
		for (i = 0;i < col;i++)
		{
			for (j = 0;j <= i != 0 && j < row;j++)
			{
				System.out.printf("%d\n",sz[j][i - j]);
			}
		}
		for (i = 1;i < row;i++)
		{
			for (j = 0;j + i < row && j < col;j++)
			{
				System.out.printf("%d\n",sz[i + j][col - j - 1]);
			}
		}
	}
}

