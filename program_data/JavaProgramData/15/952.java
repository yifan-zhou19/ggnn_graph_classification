package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int n;
		int i;
		int j;
		int a = 0;
		int b = 1000;
		int c = 0;
		int d = 1000;
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
					if (i > a)
					{
						a = i;
					}
					if (i < b)
					{
						b = i;
					}

					if (j > c)
					{
						c = j;
					}
					if (j < d)
					{
						d = j;
					}
				}
			}
		}
		x = a - b - 1;
		y = c - d - 1;
		s = x * y;
		System.out.printf("%d",s);
		return 0;
	}
}

