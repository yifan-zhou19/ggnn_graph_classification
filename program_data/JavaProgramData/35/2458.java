package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[8][8];
		int i;
		int j;
		int r;
		int c;
		int k;
		int row = 0;
		int col = 0;
		int zh = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				col = 0;
				row = 0;
				for (k = 0;k < c;k++)
				{
					if (sz[i][j] >= sz[i][k])
					{
						col++;
					}
				}
				for (k = 0;k < r;k++)
				{
					if (sz[i][j] <= sz[k][j])
					{
						row++;
					}
				}
				if ((row == r) && (col == c))
				{
					System.out.printf("%d+%d\n",i,j);
					zh = 1;
				}
			}
		}
		if (zh == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

