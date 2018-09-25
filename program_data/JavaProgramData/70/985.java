package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double sq = new double(double c,double d,double e,double f);
	double[] a = new double[100];
	double[] b = new double[100];
	int n;
	int i;
	int j;
	double max;
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
		a[i] = Double.parseDouble(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Double.parseDouble(tempVar3);
	}
	}
	max = sq(a[0], b[0], a[1], b[1]);
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
		if (sq(a[i], b[i], a[j], b[j]) > max)
		{
			max = sq(a[i], b[i], a[j], b[j]);
		}
		}
	}
	System.out.printf("%.4lf",max);
	return 0;
	}
	public static double sq(double c,double d,double e,double f)
	{
		double s;
		s = (c - e) * (c - e) + (d - f) * (d - f);
		s = Math.sqrt(s);
		return s;
	}
}

