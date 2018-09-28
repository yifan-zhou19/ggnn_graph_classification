package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	double[] sz = new double[m];
	for (i = 0;i < m;i++)
	{
	int n;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	int j;
	double sum = 0.0;
	int a = 2;
	int b = 1;
	int e;
	for (j = 0;j < n;j++)
	{
	double t;
	t = 1.0 * a / b;
	sum += t;
	e = b;
	b = a;
	a = e + b;
	}
	System.out.printf("%.3lf\n",sum);
	}
	return 0;
	}
}

