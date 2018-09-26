package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int p;
		double a;
		double b;
		double c;
		double d;
		n >= 0 && n <= 100;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = b = c = d = 0;
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
			else if (p >= 61)
			{
			d++;
			}
		}
		a = a / n * 100;
		b = b / n * 100;
		c = c / n * 100;
		d = d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
	return 0;
	}

}

