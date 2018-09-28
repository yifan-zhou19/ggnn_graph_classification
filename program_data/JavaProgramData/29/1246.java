package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int q = 0;
	int n;
	double e;
	double[] sz = new double[100];
	double b = 1.0;
	double a = 2.0;
	double sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < m;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int j = 0;j < n;j++)
		{
			sum = a / b + sum;
			e = b;
			b = a;
			a = a + e;
		}
		sz[q] = sum;
		q++;
		sum = 0;
		b = 1.0;
		a = 2.0;
	}
	for (int x = 0;x < m;x++)
	{
		System.out.printf("%.3lf\n",sz[x]);
	}
	return 0;
	}

}

