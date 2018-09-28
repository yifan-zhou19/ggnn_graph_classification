package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int i;
	double b;
	double c;
	double d;
	double e;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	b = 0;
	c = 0;
	d = 0;
	e = 0;
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
	if (a <= 18)
	{
	b = b + 1;
	}
	else if (a >= 19 && a <= 35)
	{
	c = c + 1;
	}
	else if (a >= 36 && a <= 60)
	{
	d = d + 1;
	}
	else
	{
	e = e+1;
	}
	}
	b = ((double)b / n) * 100;
	c = ((double)c / n) * 100;
	d = ((double)d / n) * 100;
	e = ((double)e / n) * 100;

	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",b,c,d,e);

	return 0;

	}
}

