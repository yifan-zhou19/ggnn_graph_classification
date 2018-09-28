package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int d;
	int i;
	int m;
	i = 1;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	double e;
	double f;
	double g;
	double h;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (i <= n)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (m <= 18)
	{
		a = a + 1;
		i++;
	}
	else if (m <= 35)
	{
		b = b + 1;
		i++;
	}
	else if (m <= 60)
	{
		c = c + 1;
		i++;
	}
	else
	{
		d = d + 1;
		i++;
	}
	}
	e = 1.0 * a / n * 100;
	f = 1.0 * b / n * 100;
	g = 1.0 * c / n * 100;
	h = 1.0 * d / n * 100;
	System.out.printf("1-18: %.2lf%%\n",e);
	System.out.printf("19-35: %.2lf%%\n",f);
	System.out.printf("36-60: %.2lf%%\n",g);
	System.out.printf("Over60: %.2lf%%\n",h);
	return 0;
	}






}

