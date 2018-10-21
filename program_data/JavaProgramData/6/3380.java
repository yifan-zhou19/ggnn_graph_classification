package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= k;i++)
		{
			int m;
			int n;
			int a;
			int b;
			int sp = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (a = 0;a <= m - 1;a++)
			{
				for (b = 0;b <= n - 1;b++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(sz[a][b]) = Integer.parseInt(tempVar4);
					}
					sp = sp + sz[a][b];
				}
			}
			int sum = 0;
			for (b = 0;b <= n - 1;b++)
			{
				sum = sum + sz[0][b] + sz[m - 1][b];
			}
			for (a = 0;a <= m - 1;a++)
			{
				sum = sum + sz[a][0] + sz[a][n - 1];
			}
			sum = sum - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
			if (m == 1 || n == 1)
			{
				sum = sp;
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

