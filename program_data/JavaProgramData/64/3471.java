package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		int k;
		int w;
		int p;
		int[][] sz = new int[1000][3];
		int[][] num = new int[10000][2];
		double[] d = new double[1000];
		double q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				sz[i][2] = Integer.parseInt(tempVar4);
			}
		}
	m = n * (n - 1) / 2;
	k = 0;
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
		d[k] = Math.sqrt((double)((sz[i][0] - sz[j][0]) * (sz[i][0] - sz[j][0]) + (sz[i][1] - sz[j][1]) * (sz[i][1] - sz[j][1]) + (sz[i][2] - sz[j][2]) * (sz[i][2] - sz[j][2])));
				num[k][0] = i;
				num[k][1] = j;
				k++;
			}
		}
		for (j = 1;j <= m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (d[i] < d[i + 1])
				{
					q = d[i];
					d[i] = d[i + 1];
					d[i + 1] = q;
					w = num[i][0];
	num[i][0] = num[i + 1][0];
	num[i + 1][0] = w;
					p = num[i][1];
	num[i][1] = num[i + 1][1];
	num[i + 1][1] = p;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",sz[num[i][0]][0],sz[num[i][0]][1],sz[num[i][0]][2],sz[num[i][1]][0],sz[num[i][1]][1],sz[num[i][1]][2],d[i]);
		}
		return 0;
	}

}

