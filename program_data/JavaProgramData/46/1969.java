package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int h;
		int l;
		int i;
		int[][] sz = new int[100][100];
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
		for (h = 0;h < m;h++)
		{
			for (l = 0;l < n;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					(sz[h][l]) = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < (m + 1) / 2 && i < (n + 1) / 2;i++)
		{
			for (l = i;l < n - 1 - i;l++)
			{
				System.out.printf("%d\n",sz[i][l]);
			}
			for (h = i;h <= m - 1 - i;h++)
			{
				System.out.printf("%d\n",sz[h][n - 1 - i]);
			}
			for (l = n - 2 - i;l >= i;l--)
			{
				if (i != m - 1 - i && i != n - 1 - i)
				{
					System.out.printf("%d\n",sz[m - 1 - i][l]);
				}
			}
			for (h = m - 2 - i;h >= 1 + i;h--)
			{
				if (i != m - 1 - i && i != n - 1 - i)
				{
					System.out.printf("%d\n",sz[h][i]);
				}
			}
		}
		return 0;
	}

}

