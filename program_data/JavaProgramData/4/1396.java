package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[101][101];
		int row;
		int col;
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
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		System.out.printf("%d",sz[0][0]);
		int a;
		for (i = 1;i < col;i++)
		{
			a = i;
			for (j = 0;j < row && j <= i;j++)
			{
				System.out.printf("\n%d",sz[j][a]);
				a--;
			}
		}
		for (j = 1;j < row;j++)
		{
			a = j;
			for (i = col - 1;a < row && i >= 0;i--)
			{
				System.out.printf("\n%d",sz[a][i]);
				a++;
			}
		}
		return 0;
	}


}

