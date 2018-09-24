package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int m;
		int n;
		int i;
		int j;
		int a;
		int t;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (t = 1;t <= a;t++)
		{
			int s = 0;
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}

		for (i = 1;i <= m;i++)
		{
			s += sz[i][1];
		}
		for (i = 1;i <= m;i++)
		{
				s += sz[i][n];
		}
		for (i = 1;i <= n;i++)
		{
			s += sz[1][i];
		}
		for (i = 1;i <= n;i++)
		{
			s += sz[m][i];
		}
		s -= sz[1][1] + sz[1][n] + sz[m][1] + sz[m][n];
		System.out.printf("%d\n",s);
		}

	return 0;
	}
}

