package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int x;
		double q;
		double w;
		double e;
		double r;
		double a;
		double b;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Integer.parseInt(tempVar2);
			}
			if (x <= 18)
			{
				a = a + 1;
			}
			else if ((x > 18) && (x <= 35))
			{
				b = b + 1;
			}
			else if ((x >= 36) && (x <= 60))
			{
				c = c + 1;
			}
			else if (x > 60)
			{
				d = d + 1;
			}
		}
		q = a / n * 100;
		w = b / n * 100;
		e = c / n * 100;
		r = d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",q);
		System.out.printf("19-35: %.2lf%%\n",w);
		System.out.printf("36-60: %.2lf%%\n",e);
		System.out.printf("60??: %.2lf%%\n",r);
		return 0;
	}

}

