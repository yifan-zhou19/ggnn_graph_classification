package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int p = 0;
	int[][] sz1 = new int[22][22];
	int[] sz2 = new int[400];
	int[] sz3 = new int[400];
	int i;
	int j;
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
	for (i = 0;i <= m - 1;i++)
	{
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz1[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (j = -1;j <= n;j++)
	{
		sz1[-1][j] = -1;
		sz1[m][j] = -1;
	}
	for (i = -1;i <= m;i++)
	{
		sz1[i][-1] = -1;
		sz1[i][n] = -1;
	}
	for (i = 0;i <= m - 1;i++)
	{
		for (j = 0;j <= n - 1;j++)
		{
			if (sz1[i][j] >= sz1[i - 1][j] != 0 && sz1[i][j] >= sz1[i][j - 1] != 0 && sz1[i][j] >= sz1[i][j + 1] != 0 && sz1[i][j] >= sz1[i + 1][j])
			{
				sz2[p] = i;
				sz3[p] = j;
				p++;
			}
		}
	}
	for (i = 0;i <= p - 1;i++)
	{
		System.out.printf("%d %d\n",sz2[i],sz3[i]);
	}
	return 0;
	}
}

