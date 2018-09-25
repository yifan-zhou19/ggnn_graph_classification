package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int i;
		int j;
		int n;
		int m;
		int k = 0;
		int[][] sz = new int[len + 2][len + 2];
		int[] x = new int[len];
		int[] y = new int[len];
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
		for (j = 1;j < m + 1;j++)
		{
			for (i = 1;i < n + 1;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j][i] = Integer.parseInt(tempVar3);
				}
			}
		}
			for (j = 0;j < m + 2;j++)
			{
				for (i = 0;i < n + 2;i++)
				{
					sz[0][i] = 0;
					sz[j][0] = 0;
					sz[m + 1][i] = 0;
					sz[j][n + 1] = 0;
				}
			}
			for (j = 1;j < m + 1;j++)
			{









				for (i = 1;i < n + 1;i++)
				{
					if ((sz[j][i] >= sz[j][i + 1]) && (sz[j][i] >= sz[j][i - 1]) && (sz[j][i] >= sz[j + 1][i]) && (sz[j][i] >= sz[j - 1][i]))
					{
						x[k] = j - 1;
						y[k] = i - 1;
						k++;
					}



				}
			}

			for (i = 0;i < k;i++)
			{
				System.out.printf("%d %d\n",x[i],y[i]);
			}
			return 0;
	}
}

