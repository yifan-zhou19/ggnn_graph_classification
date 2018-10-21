package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	double a;
	double b;
	double c;
	double d;
	a = 0;
	b = 0;
	c = 0;
	d = 0;
	int i;
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] e = new int[n];
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(e[i]) = Integer.parseInt(tempVar2);
		}
		if ((e[i]) >= 1 && (e[i]) <= 18)
		{
			a = a + 1;
		}
		else if ((e[i]) >= 19 && (e[i]) <= 35)
		{
			b = b + 1;
		}
		else if ((e[i]) >= 36 && (e[i]) <= 60)
		{
			c = c + 1;
		}
		else if ((e[i]) > 60)
		{
			d = d + 1;
		}
	}
		a = 100.0 * a / n;
		b = 100.0 * b / n;
		c = 100.0 * c / n;
		d = 100.0 * d / n;
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",a,b,c,d);
		return 0;
	}



}

