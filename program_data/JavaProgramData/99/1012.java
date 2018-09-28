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
		int x;
		int i;
		double e;
		double f;
		double g;
		double h;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i += 1)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		if (x <= 18)
		{
			a += 1;
		}
		else if (x >= 19 && x <= 35)
		{
			b += 1;
		}
		else if (x >= 36 && x <= 60)
		{
			c += 1;
		}
		else if (x >= 61)
		{
			d += 1;
		}
		}
		e = 100 * 1.0 * a / n;
		f = 100 * 1.0 * b / n;
		g = 100 * 1.0 * c / n;
		h = 100 * 1.0 * d / n;
		System.out.printf("1-18: %.2lf%%\n",e);
		System.out.printf("19-35: %.2lf%%\n",f);
		System.out.printf("36-60: %.2lf%%\n",g);
		System.out.printf("60??: %.2lf%%\n",h);
		return 0;
	}
}

