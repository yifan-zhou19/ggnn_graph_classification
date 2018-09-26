package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double[] sum = new double[100];
	a = 2;
	b = 1;
	int n;
	int j;
	int e;
	int m;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int k;
	for (k = 0;k < n;k++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	for (j = 0;j < m;j++)
	{
	sum[k] += a / b;
	e = b;
	b = a;
	a = e + a;
	}
	a = 2;
	b = 1;

	System.out.printf("%.3lf\n",sum[k]);
	}
	return 0;
	}

}

