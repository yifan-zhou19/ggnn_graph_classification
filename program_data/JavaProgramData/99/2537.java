package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int i = 1;
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
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
				y = Integer.parseInt(tempVar2);
			}
			if (y >= 1 && y <= 18)
			{
				a = a + 1;
			}
			if (y >= 19 && y <= 35)
			{
				b = b + 1;
			}
			if (y >= 36 && y <= 60)
			{
				c = c + 1;
			}
			if (y >= 61)
			{
				d = d + 1;
			}
			i++;
		}
		e = 1.0 * a / n * 100;
		f = 1.0 * b / n * 100;
		g = 1.0 * c / n * 100;
		h = 1.0 * d / n * 100;
		System.out.printf("1-18: %.2lf%%\n",e);
		System.out.printf("19-35: %.2lf%%\n",f);
		System.out.printf("36-60: %.2lf%%\n",g);
		System.out.printf("60??: %.2lf%%\n",h);
		return 0;
	}

}

