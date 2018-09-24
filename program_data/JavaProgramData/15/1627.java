package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[1000][1000];
		int i;
		int j;
		int n;
		int a1;
		int b1;
		int a2;
		int b2;
		int x;
		int y;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				if (sz[i][j] == 0)
				{
					a1 = i;
					b1 = j;
					break;
				}
			}
			if ((a1 == i) && (b1 == j))
			{
				break;
			}
		}
		for (y = b1; y < n; y++)
		{
			if (sz[a1][y] == 255)
			{
				b2 = y - 1;
				break;
			}
		}
		for (x = a1; x < n; x++)
		{
			if (sz[x][b1] == 255)
			{
				a2 = x - 1;
				break;
			}
		}
		t = (a2 - a1 - 1) * (b2 - b1 - 1);
		System.out.printf("%d", t);
		return 0;
	}
}

