package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		int x;
		int y;
		int i = 0;
		int j = 0;
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
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n > -1 && n < 5 && m>-1 && m < 5)
		{
			for (y = 0;y < 5;y++)
			{
				int e;
				e = sz[n][y];
				sz[n][y] = sz[m][y];
				sz[m][y] = e;
			}
			for (x = 0;x < 5;x++)
			{
				for (y = 0;y < 5;y++)
				{
					if (y != 4)
					{
						System.out.printf("%d ",sz[x][y]);
					}
					else
					{
						System.out.printf("%d\n",sz[x][y]);
					}
				}
			}
			return 1;
		}
		else
		{
			System.out.print("error");
			return 0;

		}
	}
}

