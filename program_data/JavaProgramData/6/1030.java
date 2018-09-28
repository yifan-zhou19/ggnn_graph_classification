package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int m;
		int n;
		int k;
		int x;
		x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < k;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		for (int row = 0;row < m;row++)
		{
				for (int col = 0;col < n;col++)
				{
						String tempVar4 = ConsoleInput.scanfRead();
						if (tempVar4 != null)
						{
							sz[row][col] = Integer.parseInt(tempVar4);
						}
				}
		}
		for (int row = 0;row < m;row++)
		{
				x += sz[row][0];
		}
		for (int col = 1;col < n;col++)
		{
				x += sz[0][col];
		}
		for (int row = 1;row < m;row++)
		{
				x += sz[row][n - 1];
		}
		for (int col = 1;col < n - 1;col++)
		{
				x += sz[m - 1][col];
		}
		System.out.printf("%d\n",x);
		x = 0;
		}
	return 0;
	}
}

