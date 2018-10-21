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
	int k;
	int time;
	time = 0;
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
	for (i = 0;i < m;i++)
	{
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (k = 0;k <= 1000000;k++)
	{
		if (time == n * m)
		{
			break;
		}

	for (i = k;i < n - k;i++)
	{

		if (time == n * m)
		{
			break;
		}
		System.out.printf("%d\n",sz[k][i]);
		time++;

	}
	for (i = 1 + k;i < m - k;i++)
	{

		if (time == n * m)
		{
			break;
		}
		System.out.printf("%d\n",sz[i][n - 1 - k]);
		time++;

	}
	for (i = n - 2 - k;i >= k;i--)
	{

		if (time == n * m)
		{
			break;
		}
		System.out.printf("%d\n",sz[m - 1 - k][i]);
		time++;

	}
	for (i = m - 2 - k;i >= 1 + k;i--)
	{

		if (time == n * m)
		{
			break;
		}
		System.out.printf("%d\n",sz[i][k]);
		time++;

	}


	}
	return 0;
	}

}

