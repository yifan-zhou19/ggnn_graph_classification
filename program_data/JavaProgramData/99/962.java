package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int r = 0;
		int s = 0;
		int t = 0;
		int u = 0;
		int y;
		double a;
		double b;
		double c;
		double d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			if (y <= 18)
			{
				r = r + 1;
			}
			else if ((y >= 19) && (y <= 35))
			{
				s++;
			}
			else if ((y >= 36) && (y <= 60))
			{
				t++;
			}
			else if (y >= 61)
			{
				u++;
			}
		}
			a = 100.0 * r / n;
			b = 100.0 * s / n;
			c = 100.0 * t / n;
			d = 100.0 * u / n;
			System.out.printf("1-18: %.2lf%%\n",a);
			System.out.printf("19-35: %.2lf%%\n",b);
			System.out.printf("36-60: %.2lf%%\n",c);
			System.out.printf("60??: %.2lf%%\n",d);
	 return 0;
	}
}

