package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p;
		int q;
		int e;
		int[][] sz = new int[50000][2];
		int[][] sz2 = new int[50000][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 2;j++)
			{
				sz2[i][j] = sz[i][j];
			}
		}
		for (p = 1;p <= n;p++)
		{
			for (q = 1;q <= n - p;q++)
			{
				if (sz2[q][1] > sz2[q + 1][1])
				{
					e = sz2[q + 1][1];
					sz2[q + 1][1] = sz2[q][1];
					sz2[q][1] = e;
				}
			}
		}
		for (p = 1;p <= n;p++)
		{
			for (q = 1;q <= n - p;q++)
			{
				if (sz2[q][2] > sz2[q + 1][2])
				{
					e = sz2[q + 1][2];
					sz2[q + 1][2] = sz2[q][2];
					sz2[q][2] = e;
				}
			}
		}
		for (i = sz2[1][1];i <= sz2[n][2];i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (i < sz[j][2] && i >= sz[j][1])
				{
					break;
				}
				else if (j == n && i > sz[j][2] || j == n && i < sz[j][1])
				{
					System.out.print("no");
					return 0;
				}
			}
		}
		System.out.printf("%d %d",sz2[1][1],sz2[n][2]);
		return 0;
	}

}

