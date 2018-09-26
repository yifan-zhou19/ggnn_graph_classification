package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] n = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(n[i]) = Integer.parseInt(tempVar2);
			}
		}
		int[] sz = new int[1000];
		double[] xsz = new double[1000];
		sz[0] = 1;
		sz[1] = 2;
		xsz[0] = (sz[1]) / (sz[0]);
		int k;
		double[] sum = new double[1000];
		for (i = 0;i < m;i++)
		{
			sum[i] = xsz[0];
			for (k = 1;k < (n[i]);k++)
			{
				sz[k + 1] = sz[k] + sz[k - 1];
				xsz[k] = (sz[k + 1]) * 1.0 / (sz[k]);
				sum[i] += xsz[k];
			}
			System.out.printf("%.3lf\n",sum[i]);
		}
		return 0;
	}
}

