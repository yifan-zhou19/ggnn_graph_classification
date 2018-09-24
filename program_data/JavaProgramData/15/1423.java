package <missing>;

public class GlobalMembers
{
	public static int[][] sz = new int[1000][1000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x;
		int y;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (sz[i][j] == 0)
				{
				break;
				}
			}
			if (j < n)
			{
				break;
			}
		}
		for (x = n - 1;x >= 0;x--)
		{
			for (y = n - 1;y >= 0;y--)
			{
				if (sz[x][y] == 0)
				{
					break;
				}
			}
			if (y >= 0)
			{
				break;
			}
		}
		s = (x - i - 1) * (y - j - 1);
		System.out.printf("%d",s);
		return 0;
	}
}

