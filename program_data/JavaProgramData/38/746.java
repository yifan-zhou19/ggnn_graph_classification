package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
	double[][] a = new double[100][100];
	double b;
	double c;
	double e;
	double[] f = new double[100];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
		double sum = 0;
		double d = 0;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][j] = Double.parseDouble(tempVar3);
			}
		}
			for (j = 0;j < n;j++)
			{
			sum += a[i][j];
			}
			b = 1.0 * sum / n;
			for (j = 0;j < n;j++)
			{
			c = (a[i][j] - b) * (a[i][j] - b);
			d += c;
			}
		e = Math.sqrt(1.0 * d / n);
		f[i] = e;
	}
	for (i = 0;i < k;i++)
	{
		System.out.printf("%.5lf\n",f[i]);
	}
	return 0;
	}

}

