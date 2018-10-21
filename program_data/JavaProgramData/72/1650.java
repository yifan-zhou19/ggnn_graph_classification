package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[101][101];
		int x;
		int y;
		int h = 0;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (x = 1;x < m + 1;x++)
		{
			for (y = 1;y < n + 1;y++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[x][y] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (x = 1;x < m + 1;x++)
		{
			for (y = 1;y < n + 1;y++)
			{
				if (a[x][y] >= a[x][y - 1] != 0 && a[x][y] >= a[x][y + 1] != 0 && a[x][y] >= a[x + 1][y] != 0 && a[x][y] >= a[x - 1][y])
				{
					System.out.printf("%d %d\n",x - 1,y - 1);
				}
			}
		}
		return 0;
	}
}

