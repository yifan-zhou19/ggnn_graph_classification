package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	double s = 0;
	double l = 0;
	double[] x = new double[1000];
	double[] y = new double[1000];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (m = 0;m < n;m++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		x[m] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		y[m] = Double.parseDouble(tempVar3);
	}
	}
	for (i = 0;i < n - 1;i++)
	{
	for (j = i + 1;j < n;j++)
	{
	s = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]));
	if (l < s)
	{
		l = s;
	}
	}
	}
	System.out.printf("%.4lf",l);
	return 0;
	}
}

