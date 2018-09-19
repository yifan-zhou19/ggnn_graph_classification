package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int f = 0;
		int x1;
		int y1;
		int x2;
		int y2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;++i)
		{
			for (j = 0;j < n;++j)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] + j = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;++i)
		{
			for (j = 0;j < n;++j)
			{
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
					f = 1;
					break;
				}
			}
			if (f != 0)
			{
				break;
			}
		}
		for (i = y1;i < n;++i)
		{
			if ((a[x1][i + 1] != 0) || (i + 1 >= n))
			{
				y2 = i;
				break;
			}
		}
		for (i = x1;i < n;++i)
		{
			if ((a[i + 1][y1] != 0) || (i + 1 >= n))
			{
				x2 = i;
				break;
			}
		}
		if ((x2 - x1 < 2) || (y2 - y1 < 2))
		{
				System.out.printf("%d",0);
				return 0;
		}
		System.out.printf("%d",(x2 - x1 - 1) * (y2 - y1 - 1));
		return 0;
	}

}

