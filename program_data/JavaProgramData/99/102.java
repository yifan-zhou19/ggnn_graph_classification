package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double b = 0;
		double c = 0;
		double d = 0;
		double e = 0;
		double f = 0;
		int n;
		int i;
		double r;
		double s;
		double t;
		double u;
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
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > 60)
			{
				b = b + 1;
			}
			else
			{
				if (a[i] > 35)
				{
					c = c + 1;
				}
				else
				{
					if (a[i] > 18)
					{
						d = d + 1;
					}
					else
					{
						e = e+1;
					}
				}
			}
		}
		f = b + c + d + e;
		u = 100 * b / f;
		t = 100 * c / f;
		s = 100 * d / f;
		r = 100 * e / f;
		System.out.printf("1-18: %.2lf%%\n", r);
		System.out.printf("19-35: %.2lf%%\n", s);
		System.out.printf("36-60: %.2lf%%\n", t);
		System.out.printf("60??: %.2lf%%\n", u);
		return 0;
	}
}

