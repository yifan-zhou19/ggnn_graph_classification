package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int a;
	int b;
	int e;
	int m;
	int j;
	double c;
	double d;
	a = 1;
	b = 2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	int[] sz = new int[m];
	for (i = 0;i < m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	double[] sum = new double[m];
	for (i = 0;i < m;i++)
	{
	sum[i] = 0;
	}
	for (j = 0;j < m;j++)
	{
	a = 1;
	b = 2;
	for (i = 0;i < sz[j];i++)
	{
	c = a;
	d = b;
	sum[j] += (double)d / c;
	e = a;
	a = b;
	b = e + b;
	}
	}
	for (i = 0;i < m;i++)
	{
	System.out.printf("%.3lf\n",sum[i]);
	}
	return 0;
	}


}

