package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
	double s;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= m;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	double[] x = new double[n];
	double[] y = new double[n];
	x[0] = 2;
	x[1] = 3;
	y[0] = 1;
	y[1] = 2;
	if (n == 1)
	{
		s = 2;
	}
	else if (n == 2)
	{
		s = 3.5;
	}
	else
	{
		s = 3.5;
	for (j = 2;j < n;j++)
	{
	x[j] = x[j - 1] + x[j - 2];
	y[j] = y[j - 1] + y[j - 2];
		s += x[j] / y[j];
	}
	}
	System.out.printf("%.3lf\n",s);
	}
	return 0;
	}
}

