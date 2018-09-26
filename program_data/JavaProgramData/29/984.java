package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double[] sz = new double[1000];
	int n;
	int a;
	double b;
	double c;
	double q;
	double d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 1;i <= n;i++)
	{
	q = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a = Integer.parseInt(tempVar2);
	}
	d = 1;
	b = 2;
	for (int j = 0;j < a;j++)
	{
	c = d + b;
	sz[j] = b / d;
	d = b;
	b = c;
	c = 0;
	}
	for (int w = 0;w < a;w++)
	{
	q = q + sz[w];
	}
	System.out.printf("%.3lf\n",q);
	}
	}


}

