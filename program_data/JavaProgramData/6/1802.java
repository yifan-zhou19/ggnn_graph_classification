package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (int l = 1;l <= k;l++)
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
			for (i = 0;i < m;i++)
			{
				for (int j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						sz[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			for (i = 0;i < m;i++)
			{
				a += sz[i][0];
				b += sz[i][n - 1];
			}
			for (int j = 0;j < n;j++)
			{
				c += sz[0][j];
				d += sz[m - 1][j];
			}
			e = a + b + c + d - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
			System.out.printf("%d\n",e);
			e = 0;
			a = 0;
			b = 0;
			c = 0;
			d = 0;
		}
		return 0;
	}
}

