package <missing>;

public class GlobalMembers
{
	public static double[] x = new double[1005];
	public static double[] y = new double[1005];
	public static int Main()
	{
	int n;
	int i;
	int j;
	double max = 0;
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
	for (i = 1;i < n;i++)
	{
	for (j = 0;j < i;j++)
	{
	double dist = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
	if (dist > max)
	{
	max = dist;
	}
	}
	}
	System.out.printf("%.4lf\n",Math.sqrt(max));
	return 0;
	}
}

