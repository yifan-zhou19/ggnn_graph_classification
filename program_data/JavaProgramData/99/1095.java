package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double n;
		double a;
		double b;
		double c;
		double d;
		double x;
		double m;
		double h;
		double p;
		double q;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		int i = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Double.parseDouble(tempVar);
		}
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x = Double.parseDouble(tempVar2);
			}
			if (x <= 18)
			{
				a++;
			}
			else if (x >= 19 && x <= 35)
			{
				b++;
			}
			else if (x >= 36 && x <= 60)
			{
				c++;
			}
			else if (x > 60)
			{
				d++;
			}
			i++;
		}
		m = 100 * a / n;
		h = 100 * b / n;
		p = 100 * c / n;
		q = 100 * d / n;
	   System.out.printf("1-18: %.2lf",m);
	   System.out.print("%%\n");
	   System.out.printf("19-35: %.2lf",h);
	   System.out.print("%%\n");
	   System.out.printf("36-60: %.2lf",p);
	   System.out.print("%%\n");
	   System.out.printf("60??: %.2lf",q);
	   System.out.print("%%");
		return 0;

	}
}

