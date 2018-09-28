package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		int n1;
		int l;
		double[] sz = new double[1000];
		double[] m = new double[1000];
		double[] m2 = new double[10000];
		double[] sum = new double[1000];
		double[] summ = new double[1000];
		for (l = 0;l < 1000;l++)
		{
		sum[l] = 0;
		summ[l] = 0;
		m[l] = 0;
		}
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
				n1 = Integer.parseInt(tempVar2);
			}
			for (k = 0;k < n1;k++)
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[k] = Double.parseDouble(tempVar3);
			}
			sum[i] += sz[k];
			}
			m[i] = sum[i] / n1;
			for (k = 0;k < n1;k++)
			{
				summ[i] += (sz[k] - m[i]) * (sz[k] - m[i]);
				m2[i] = Math.sqrt((summ[i]) / n1);
			}

		}
			for (i = 0;i < n;i++)
			{
				System.out.printf("%.5lf\n",m2[i]);
			}
	return 0;
	}
}

