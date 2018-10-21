package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int p = 0;
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
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < row;i++)
		{
					  m = 0;
			if (p == 1)
			{
				break;
			}
			for (j = 1;j < col;j++)
			{
				if (sz[i][j] > sz[i][j - 1])
				{
					m = j;
				}
				else
				{
					sz[i][j] = sz[i][j - 1];
				}
			}
			for (n = 0;n < row;n++)
			{
				if (sz[n][m] >= sz[i][m])
				{
					if (n == (row - 1))
					{
						System.out.printf("%d+%d",i,m);
						p++;
						break;
					}
				}
				else
				{
					break;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

