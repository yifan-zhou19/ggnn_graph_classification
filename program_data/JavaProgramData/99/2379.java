package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int i;
	int t;
	int m = 0;
	int n = 0;
	int p = 0;
	int q = 0;
	double x;
	double y;
	double z;
	double v;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	for (i = 0;i < a;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		t = Integer.parseInt(tempVar2);
	}
	if (t <= 18)
	{
	m += 1;
	}
	else if ((t >= 19) && (t < 36))
	{
	n += 1;
	}
	else if ((t >= 36) && (t < 61))
	{
	p += 1;
	}
	else
	{
		q += 1;
	}
	}
	x = m * 100.0 / a;
	y = n * 100.0 / a;
	z = p * 100.0 / a;
	v = q * 100.0 / a;
	System.out.printf("1-18: %.2lf%%\n",x);
	System.out.printf("19-35: %.2lf%%\n",y);
	System.out.printf("36-60: %.2lf%%\n",z);
	System.out.printf("60??: %.2lf%%\n",v);
	return 0;
	}
}

