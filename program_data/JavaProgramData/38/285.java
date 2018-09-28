package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		double k;
		double[] n = new double[100];
		double[] x = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double[] c = new double[100];
		double[] d = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Double.parseDouble(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			a[i] = 0;
			c[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Double.parseDouble(tempVar2);
			}
			for (j = 0;j < n[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					x[j] = Double.parseDouble(tempVar3);
				}
			}
			for (j = 0;j < n[i];j++)
			{
				a[i] = a[i] + x[j];
			}
			b[i] = a[i] / n[i];
			for (j = 0;j < n[i];j++)
			{
				c[i] = c[i] + (x[j] - b[i]) * (x[j] - b[i]);
			}
			d[i] = Math.sqrt(c[i] / n[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%.5lf\n",d[i]);
		}
		return 0;
	}
}

