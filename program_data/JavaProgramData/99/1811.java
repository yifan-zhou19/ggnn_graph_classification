package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	double a1;
	double b1;
	double c1;
	double d1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
	if (k <= 18)
	{
		a++;
	}
	else if (k <= 35)
	{
		b++;
	}
	else if (k <= 60)
	{
		c++;
	}
	else
	{
		d++;
	}
	}
	a *= 100;
	b *= 100;
	c *= 100;
	d *= 100;
	a1 = (double)(a) / n;
	b1 = (double)(b) / n;
	c1 = (double)(c) / n;
	d1 = (double)(d) / n;
	System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",a1,b1,c1,d1);
	return 0;
	}
}

