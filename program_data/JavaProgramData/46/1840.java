package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int[] sc = new int[10000];
		int m;
		int n;
		int i;
		int j;
		int a;
		int t;
		int k;


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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		j = 1;
		for (k = 1;k <= n - n / 2;k++)
		{
		for (i = k;i <= n - k + 1;i++)
		{
			sc[j] = sz[k][i];
			j++;
		}
		for (i = k;i <= m - k;i++)
		{
				sc[j] = sz[i + 1][n - k + 1];
				j++;
		}
		for (i = n - k;i >= k;i--)
		{
			sc[j] = sz[m - k + 1][i];
			j++;
		}
		for (i = m - k;i >= k + 1;i--)
		{
			sc[j] = sz[i][k];
			j++;
		}
		}
		for (i = 1;i <= m * n;i++)
		{
			System.out.printf("%d\n",sc[i]);
		}


	return 0;
	}
}

