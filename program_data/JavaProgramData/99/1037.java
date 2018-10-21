package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		double a;
		double b;
		double c;
		double d;
		i = 1;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
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
				x = Integer.parseInt(tempVar2);
			}
			if (x <= 18)
			{
				a = a + 1;
			}
			else if (x <= 35)
			{
				b = b + 1;
			}
			else if (x <= 60)
			{
				c = c + 1;
			}
			else
			{
				d = d + 1;
			}
			i = i + 1;
		}
		a = 100 * a / n;
		b = 100 * b / n;
		c = 100 * c / n;
		d = 100 * d / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%\n",d);
		return 0;
	}



}

