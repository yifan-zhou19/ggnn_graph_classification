package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		int i;
		int i2;
		int t;
		double[] x = new double[1000];
		double[] s = new double[100];
		double[] sum = new double[100];
		double[] a = new double[100];
		double[] m = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (t = 0;t < k;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[t] = Integer.parseInt(tempVar2);
			}
			for (i = 0;i < n[t];i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[i] = Double.parseDouble(tempVar3);
				}
				sum[t] += x[i];
			}
			a[t] = sum[t] / n[t];
			for (i2 = 0;i2 < n[t];i2++)
			{
				m[t] += (x[i2] - a[t]) * (x[i2] - a[t]);
			}
			s[t] = (double)Math.sqrt(m[t] / (double)n[t]);
			System.out.printf("%.5lf\n",s[t]);
		}
		return 0;
	}
}

