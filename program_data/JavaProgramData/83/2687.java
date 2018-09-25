package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	double[] a = new double[10];
	double[] b = new double[10];
	double s;
	double m;
	double g;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0,m = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Double.parseDouble(tempVar2);
	}
	m = m + a[i];
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Double.parseDouble(tempVar3);
		}
	}
	for (i = 0,s = 0;i < n;i++)
	{
	if (b[i] >= 90 && b[i] <= 100)
	{
		b[i] = 4.0;
	}
	else if (b[i] >= 85 && b[i] <= 89)
	{
		b[i] = 3.7;
	}
	else if (b[i] >= 82 && b[i] <= 84)
	{
		b[i] = 3.3;
	}
	else if (b[i] >= 78 && b[i] <= 81)
	{
		b[i] = 3.0;
	}
	else if (b[i] >= 75 && b[i] <= 77)
	{
		b[i] = 2.7;
	}
	else if (b[i] >= 72 && b[i] <= 74)
	{
		b[i] = 2.3;
	}
	else if (b[i] >= 68 && b[i] <= 71)
	{
		b[i] = 2.0;
	}
	else if (b[i] >= 64 && b[i] <= 67)
	{
		b[i] = 1.5;
	}
	else if (b[i] >= 60 && b[i] <= 63)
	{
		b[i] = 1.0;
	}
	else
	{
		b[i] = 0;
	}
	s = s + a[i] * b[i];
	}
	g = s / m;
	System.out.printf("%.2lf\n",g);
	return 0;
	}

}

