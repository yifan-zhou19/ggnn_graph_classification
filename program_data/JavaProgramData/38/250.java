package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		double[] a = new double[101];
		double ave;
		double r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (j = 0;j < m;j++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		double sum = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
			sum += a[i];
		}
		ave = sum / n;
		sum = 0;
		double[] p;
		p = a;
		for (i = 0;i < n;i++)
		{
			sum += (p[i] - ave) * (p[i] - ave);
		}
		r = (double)Math.sqrt(sum / n);
		System.out.printf("%.5lf\n",r);
		}
	}
}

