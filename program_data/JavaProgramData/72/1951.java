package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N = 1000;
	int m;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int[][] sz = new int[m + 2][n + 2];
	for (int i = 1;i <= m + 2;i++)
	{
	for (int t = 1;t <= n + 2;t++)
	{
		sz[i - 1][t - 1] = 0;
	}
	}

	for (int i = 1;i <= m;i++)
	{
	for (int t = 1;t <= n;t++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i][t] = Integer.parseInt(tempVar3);
		}
	}
	}

	int[][] a = new int[N][2];
	int x = 0;

	for (int i = 1;i <= m;i++)
	{
	for (int t = 1;t <= n;t++)
	{
	if (sz[i][t] >= sz[i - 1][t] != 0 && sz[i][t] >= sz[i][t - 1] != 0 && sz[i][t] >= sz[i + 1][t] != 0 && sz[i][t] >= sz[i][t + 1])
	{
		a[x][0] = i - 1;
		a[x][1] = t - 1;
		x++;
	}
	}
	}

	for (int i = 1;i < x;i++)
	{
		System.out.printf("%d %d\n",a[i - 1][0],a[i - 1][1]);
	}
	System.out.printf("%d %d",a[x - 1][0],a[x - 1][1]);

	return 0;

	}
}

