package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	double[] x = new double[100];
	double[] y = new double[100];
	double d;
	double m;
	m = 0;
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
		x[i] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y[i] = Double.parseDouble(tempVar3);
	}
	}
	for (j = 0;j < n - 1;j++)
	{
	for (k = j + 1;k < n;k++)
	{
	d = Math.sqrt(Math.pow(x[j] - x[k],2) + Math.pow(y[j] - y[k],2));
	if (m < d)
	{
	m = d;
	}
	}
	}

	System.out.printf("%.4lf",m);
	return 0;
	}
}

