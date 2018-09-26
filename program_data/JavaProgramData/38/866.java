package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	double[] sz = new double[200];
	double B = 0;
	double b = 0;
	double a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		k = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < k;i++)
	{
		double A = 0;
		double r = 0;
	int n;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	for (int p = 0;p < n;p++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		sz[p] = Double.parseDouble(tempVar3);
	}
	A += sz[p];
	}
	a = A / n;
	for (int o = 0;o < n;o++)
	{
	B = Math.pow(sz[o] - a,2);
	r += B;
	}
	b = r / n;
	b = Math.pow(b,0.5);
	System.out.printf("%.5lf\n",b);
	}


	return 0;
	}
}

