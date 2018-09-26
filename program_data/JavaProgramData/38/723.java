package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int j;
	double[] sz = new double[100];
	double sum = 0;
	double p;
	double q;
	double w;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (i = 0;i < k;i++)
	{
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
				sz[j] = Double.parseDouble(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			sum += sz[j];
		}
		p = sum / n;
		sum = 0;
		for (j = 0;j < n;j++)
		{
			sum += (sz[j] - p) * (sz[j] - p);
			q = sum / n;
		}
		w = Math.sqrt(q);
		System.out.printf("%.5lf\n",w);
		sum = 0;
	}
	}
}

