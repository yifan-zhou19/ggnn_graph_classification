package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int row;
		int col;
		int i;
		int j;
		int k = 0;
		int r;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
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
					(sz[i][j]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
			for (j = 0,r = i,c = 0;j < col;j++)
			{
				if (sz[i][j] > sz[r][c])
				{
					r = i;
					c = j;
				}
			}
			for (j = 0;j < row;j++)
			{
				if (sz[r][c] > sz[j][c])
				{
					c = 9;
					break;
				}
			}
			if (c != 9)
			{
				System.out.printf("%d+%d\n",r,c);
				k = 1;
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

