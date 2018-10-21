package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int p;
	int q;
	int e;
	int y;
	int[][] sz = new int[1000][1000];
	int[] sz2 = new int[100000];
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
	k = 0;
	for (y = 1;y <= n;y++)
	{
		if (sz[y][1] >= 90 && sz[y][1] <= 140 && sz[y][2] >= 60 && sz[y][2] <= 90)
		{
			sz2[y] = k + 1;
			k++;
		}
		else
		{
			sz2[y] = 0;
			k = 0;
		}
	}
	for (q = 1;q <= n - 1;q++)
	{
		if (sz2[q] >= sz2[q + 1])
		{
			e = sz2[q + 1];
			sz2[q + 1] = sz2[q];
			sz2[q] = e;
		}
	}
	System.out.printf("%d",sz2[n]);
	return 0;
	}
}

