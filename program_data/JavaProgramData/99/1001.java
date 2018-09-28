package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int c;
		int d;
		int x;
		double m;
		double k;
		double p;
		double q;
		a = 0;
		b = 0;
		c = 0;
		d = 0;
		i = 1;
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
			else if (x >= 60)
			{
				d += 1;
			}
				i++;

		}
			m = 1.0 * a / n * 100;
			k = 1.0 * b / n * 100;
			p = 1.0 * c / n * 100;
			q = 1.0 * d / n * 100;
			System.out.printf("1-18: %.2lf%\n",m);
			System.out.printf("19-35: %.2lf%\n",k);
			System.out.printf("36-60: %.2lf%\n",p);
			System.out.printf("60??: %.2lf%\n",q);
			return 0;
	}
}

