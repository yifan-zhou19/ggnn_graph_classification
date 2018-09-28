package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		int i;
		int n;
		int p;
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
			p = Integer.parseInt(tempVar2);
		}
		if (p <= 18)
		{
		a++;
		}
		else if (p >= 19 && p <= 35)
		{
		b++;
		}
		else if (p >= 36 && p <= 60)
		{
		c++;
		}
		else
		{
		d++;
		}
		}
			a = 100 * a / n;
			b = 100 * b / n;
			c = 100 * c / n;
			d = 100 * d / n;
			System.out.printf("1-18: %.2lf",a);
			System.out.print("%%\n");
			System.out.printf("19-35: %.2lf",b);
			System.out.print("%%\n");
			System.out.printf("36-60: %.2lf",c);
			System.out.print("%%\n");
			System.out.printf("Over60: %.2lf",d);
			System.out.print("%%");
			return 0;
	}



}

