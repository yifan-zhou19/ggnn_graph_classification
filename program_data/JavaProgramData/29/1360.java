package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] sz = new int[1000];
		int t;
		for (t = 2;t < 1000;t++)
		{
			sz[0] = 1;
			sz[1] = 1;
			sz[t] = sz[t - 1] + sz[t - 2];
		}
		double[] szp = new double[1000];
		for (t = 0;t < 1000;t++)
		{
			szp[t] = 0;
		}
		int i;
		for (i = 1;i <= m;i++)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			for (j = 2;j <= n + 1;j++)
			{
				szp[i] += 1.0 * sz[j] / sz[j - 1];
			}
		}
		for (i = 1;i <= m;i++)
		{
			System.out.printf("%.3lf\n",szp[i]);
		}
		return 0;
	}
}

