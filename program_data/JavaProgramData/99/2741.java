package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		double a = 0.00;
		double b = 0.00;
		double c = 0.00;
		double d = 0.00;
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
				t = Integer.parseInt(tempVar2);
			}
			if (t >= 1 && t <= 18)
			{
				a++;
			}
			if (t >= 19 && t <= 35)
			{
				b++;
			}
			if (t >= 36 && t <= 60)
			{
				c++;
			}
			if (t >= 61)
			{
				d++;
			}
		}
		a = 100 * (double)a / n;
		b = 100 * (double)b / n;
		c = 100 * (double)c / n;
		d = 100 * (double)d / n;
		System.out.printf("1-18: %.2lf%%\n",a);
		System.out.printf("19-35: %.2lf%%\n",b);
		System.out.printf("36-60: %.2lf%%\n",c);
		System.out.printf("60??: %.2lf%%",d);
		return 0;
	}

}

