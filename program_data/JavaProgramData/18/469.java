package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][][] sz = new int[49][49][49];
		int i;
		int j;
		int k;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				for (k = 1;k <= n;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						sz[i][j][k] = Integer.parseInt(tempVar2);
					}
				}
			}
		}
		int nn;
		int min;
		int[] re = new int[49];
		for (i = 1;i <= n;i++) //???
		{
			for (nn = 1;nn <= n - 1;nn++) //????
			{
				for (j = nn;j <= n;j++) //???
				{
					min = sz[i][j][nn];
					while (min != 0)
					{
						for (k = nn;k <= n;k++) //??????????
						{
							if (sz[i][j][k] < min)
							{
								min = sz[i][j][k];
							}
						}
						for (k = nn;k <= n;k++) //???
						{
							sz[i][j][k] -= min;
						}
					}
				}
				for (j = nn;j <= n;j++) //???
				{
					min = sz[i][nn][j];
					while (min != 0)
					{
						for (k = nn;k <= n;k++) //??????????
						{
							if (sz[i][k][j] < min)
							{
								min = sz[i][k][j];
							}
						}
						for (k = nn;k <= n;k++) //???
						{
							sz[i][k][j] -= min;
						}
					}
				}
				re[i] += sz[i][nn + 1][nn + 1];
				sz[i][nn + 1][nn + 1] = sz[i][nn][nn];
				for (j = nn + 2;j <= n;j++)
				{
					sz[i][nn + 1][j] = sz[i][nn][j];
				}
				for (j = nn + 2;j <= n;j++)
				{
					sz[i][j][nn + 1] = sz[i][j][nn];
				}
			}
			System.out.printf("%d\n",re[i]);
		}
		return 0;
	}
}

