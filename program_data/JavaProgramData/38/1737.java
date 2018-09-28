package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	double e = 0;
	double q = 0;
	int[] sz = new int[100];
	double[][] a = new double[100][1000];
	double[] c = new double[100];
	double[] d = new double[100];
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
			sz[i] = Integer.parseInt(tempVar2);
		}

		for (k = 0;k < sz[i];k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][k] = Double.parseDouble(tempVar3);
			}
			e += a[i][k];

		}
		c[i] = e / sz[i];
		e = 0;
	}
	for (i = 0;i < n;i++)
	{
		for (k = 0;k < sz[i];k++)
		{
	q += (a[i][k] - c[i]) * (a[i][k] - c[i]);

		}
		d[i] = Math.sqrt(q / sz[i]);
		q = 0;
	}
	for (i = 0;i < n;i++)
	{
		System.out.printf("%.5lf\n",d[i]);
	}

		return 0;
	}
}

