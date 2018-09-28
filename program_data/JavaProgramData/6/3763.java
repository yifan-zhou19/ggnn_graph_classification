package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int a;
		int b;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (a = 0;a < k;a++)
		{
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
		int s = 0;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						(sz[i][j]) = Integer.parseInt(tempVar4);
					}
				}
			}
			if (m == 1 && n == 1)
			{
			s = sz[0][0];
			}
			else
			{
			for (b = 0;b < n;b++)
			{
				s = s + sz[0][b] + sz[m - 1][b];
			}
			for (b = 0;b < m;b++)
			{
				s = s + sz[b][0] + sz[b][n - 1];
			}
			s = s - sz[0][0] - sz[0][n - 1] - sz[m - 1][0] - sz[m - 1][n - 1];
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}
}

