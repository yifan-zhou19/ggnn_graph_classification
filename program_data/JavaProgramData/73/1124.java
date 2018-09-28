package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int x;
		int y;
		int i;
		int j;
		int a = 0;
		for (x = 0;x < 5;x++)
		{
			for (y = 0;y < 5;y++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[x][y] = Integer.parseInt(tempVar);
				}
			}
		}
		for (x = 0;x < 5;x++)
		{
			for (y = 0;y < 5;y++)
			{
			for (j = 0;j < 5;j++)
			{
				if (sz[x][y] < sz[x][j])
				{
					break;
				}
			}
			if (j == 5)
			{
				for (i = 0;i < 5;i++)
				{
					if (sz[x][y] > sz[i][y])
					{
						break;
					}
				}
			}
			if (i == 5)
			{
				a = 1;
				System.out.printf("%d %d %d\n",x + 1,y + 1,sz[x][y]);
				i = 0;
				j = 0;
			}
			}
		}
		if (a == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

